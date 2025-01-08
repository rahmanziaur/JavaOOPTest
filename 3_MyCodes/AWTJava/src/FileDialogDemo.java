/* Demonstrate File Dialog box.
This is an application, not an applet.
*/
import java.awt.*;
import java.awt.event.*;
// Create a subclass of Frame
class SampleFrame extends Frame {
    SampleFrame(String title) {
        super(title);
// create an object to handle window events
        MyWindowAdapter adapter = new MyWindowAdapter(this);
// register it to receive those events
        addWindowListener(adapter);
    }
}
class MyWindowAdapter extends WindowAdapter {
    SampleFrame sampleFrame;
    public MyWindowAdapter(SampleFrame sampleFrame) {
        this.sampleFrame = sampleFrame;
    }
    public void windowClosing(WindowEvent we) {
        sampleFrame.setVisible(false);
    }
}
// Create frame window.
public class FileDialogDemo {
    public static void main(String args[]) {
        Frame f = new SampleFrame("File Dialog Demo");
        f.setVisible(true);
        f.setSize(100, 100);
        FileDialog fd = new FileDialog(f, "File Dialog");
        fd.setVisible(true);
    }
}