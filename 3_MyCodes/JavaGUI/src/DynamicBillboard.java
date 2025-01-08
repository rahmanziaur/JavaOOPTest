import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.awt.*;
import java.awt.image.*;
public class DynamicBillboard
        extends java.applet.Applet
        implements Runnable {
    BillData[] billboards;
    int current_billboard;
    int next_billboard;
    String[] transition_classes;
    Thread thread = null;
    Image image = null;
    long delay = -1;
    boolean mouse_inside_applet;String link_target_frame;
    boolean stopFlag;
    public void init() {
        String s = getParameter("bgcolor");
        if(s != null) {
            Color color = new Color(Integer.parseInt(s.substring(1), 16));
            setBackground(color);
            getParent().setBackground(color);
            getParent().repaint();
        }
        billboards = new
                BillData[Integer.parseInt(getParameter("billboards"))];
        current_billboard = next_billboard
                = (int)(Math.random() *billboards.length);
        parseBillData();
    }
    void parseBillData() {
        String s = getParameter("bill" + next_billboard);
        int field_end = s.indexOf(",");
        Image new_image = getImage(getDocumentBase(),
                s.substring(0, field_end));
        URL link;
        try {
            link = new URL(getDocumentBase(),
                    s.substring(field_end + 1));
        }
        catch (java.net.MalformedURLException e) {
            e.printStackTrace();
            link = getDocumentBase();
        }
        billboards[next_billboard] = new BillData(link, new_image);
        if(image == null) {
            image = new_image;
        }
        else {
            prepareImage(new_image, this);
            billboards[next_billboard].initPixels(getSize().width,
                    getSize().height);
        }}
    void finishInit() {
        if(delay != -1) {
            return;
        }
        delay = Long.parseLong(getParameter("delay"));
        link_target_frame = getParameter("target");
        if(link_target_frame == null) {
            link_target_frame = "_top";
        }
        String s = getParameter("transitions");
        int field_end = s.indexOf(",");
        int trans_count = Integer.parseInt(s.substring(0, field_end));
        transition_classes = new String[trans_count];
        for(--trans_count; trans_count > 0; --trans_count) {
            s = s.substring(field_end + 1);
            field_end = s.indexOf(",");
            transition_classes[trans_count] = s.substring(0, field_end);
        }
        transition_classes[0] = s.substring(field_end + 1);
        billboards[next_billboard].initPixels(getSize().width,
                getSize().height);
        mouse_inside_applet = false;
    }
    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }
    public void update(Graphics g) {
        paint(g);
    }
    public void start() {
        next_billboard = current_billboard;
        image = billboards[current_billboard].image;
        setCursor(new Cursor(Cursor.HAND_CURSOR));if(thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
    public void stop() {
        if(thread != null) {
            stopFlag = true;
        }
    }
    public void run() {
        while((checkImage(image, this) & ImageObserver.ALLBITS) == 0) {
            try { Thread.sleep(600); } catch (InterruptedException e) {}
        }
        finishInit();
        addMouseListener(new MyMouseAdapter());
        addMouseMotionListener(new MyMouseMotionAdapter());
        int last_transition_type = -1;
        BillTransition transition;
        long next_billboard_time;
        while(true) {
            if(stopFlag)
                return;
            next_billboard_time = System.currentTimeMillis() + delay;
            current_billboard = next_billboard;
            if(++next_billboard >= billboards.length) {
                next_billboard = 0;
            }
            if(billboards[next_billboard] == null) {
                parseBillData();
                try { Thread.sleep(120); } catch (InterruptedException e) {}
            }
            int transition_type = (int)(Math.random() *
                    (transition_classes.length - 1));
            if(transition_type >= last_transition_type) {
                ++transition_type;}
            last_transition_type = transition_type;
            try {
                String trans = transition_classes[last_transition_type];
                transition = (BillTransition)Class.forName(trans)
                        .newInstance();
            }
            catch(Exception e) {
                e.printStackTrace();
                continue;
            }
            transition.init(this,billboards[current_billboard].image_pixels,
                    billboards[next_billboard].image_pixels);
            if(System.currentTimeMillis() < next_billboard_time) {
                try {
                    Thread.sleep(next_billboard_time -
                            System.currentTimeMillis());
                } catch (InterruptedException e) { };
            }
            Graphics g = getGraphics();
            for(int c = 0; c < transition.cells.length; ++c) {
                image = transition.cells[c];
                g.drawImage(image, 0, 0, null);
                getToolkit().sync();
                try { Thread.sleep(transition.delay); }
                catch(InterruptedException e) { };
            }
            image = billboards[next_billboard].image;
            g.drawImage(image, 0, 0, null);
            getToolkit().sync();
            g.dispose();
            if(mouse_inside_applet == true) {
                showStatus(billboards[next_billboard].link.toExternalForm());
            }
            transition = null;
            try { Thread.sleep(120); } catch (InterruptedException e) {}
        }
    }public class MyMouseAdapter extends MouseAdapter {
        public void mouseExited(MouseEvent me) {
            mouse_inside_applet = false;
            showStatus("");
        }
        public void mouseReleased(MouseEvent me) {
            stop();
            setCursor(new Cursor(Cursor.WAIT_CURSOR));
            getAppletContext().showDocument(billboards[current_billboard].link,
                    link_target_frame);
        }
    }
    public class MyMouseMotionAdapter extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent me) {
            mouse_inside_applet = true;
            showStatus(billboards[current_billboard].link.toExternalForm());
        }
    }
}