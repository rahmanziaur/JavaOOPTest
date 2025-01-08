import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 3/30/15.
 */
public class EventHandlingTest implements ActionListener {
JFrame frame;
    JPanel jPanel;
    JButton submit;
    JTextField jTextField;
    public EventHandlingTest()
    {

        frame = new JFrame("Event Handling Test");
        jPanel = new JPanel();

        submit = new JButton("Submit");
        submit.addActionListener(this);
        jTextField = new JTextField(20);

        jPanel.add(submit);
        jPanel.add(jTextField);

        frame.add(jPanel);
        frame.setSize(300,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] arg)
    {

        new EventHandlingTest();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //System.out.println("You Have Clicked: "+e.getActionCommand());
        jTextField.setText(e.getActionCommand());

    }
}
