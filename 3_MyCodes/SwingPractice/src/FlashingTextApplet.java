import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by User on 3/17/15.
 */
public class FlashingTextApplet implements Runnable, ActionListener {
    JFrame flashWindow;
    JPanel panel;
    JLabel flashText;
    JButton close;

    public FlashingTextApplet()
    {
        flashWindow = new JFrame("Flashing Text!");
        panel = new JPanel();
        flashText = new JLabel("Welcome");
        close = new JButton("Close");
        flashText.setBounds(120, 43,80, 25);
        close.setBounds(180, 90, 70,25);
        close.addActionListener(this);



        panel.setLayout(null);
        panel.add(flashText);
        panel.add(close);
        flashWindow.add(panel);

        flashWindow.setSize(300,150);
        flashWindow.setLocationRelativeTo(null);
        flashWindow.setDefaultCloseOperation(flashWindow.EXIT_ON_CLOSE);
        flashWindow.setVisible(true);
        flashWindow.setResizable(false);
        new Thread(this).start();

    }

    @Override
    public void run() {
        try
        {
            while (true)
            {
                if (flashText.getText()==null)
                {
                    flashText.setText("Welcome");
                }
                else
                {
                    flashText.setText(null);
                }
                Thread.sleep(200);
            }

        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(close))
        {
            flashWindow.dispatchEvent(new WindowEvent(flashWindow, WindowEvent.WINDOW_CLOSING));
        }

    }

    public static void main(String[] arg)
    {
        new FlashingTextApplet();
    }
}
