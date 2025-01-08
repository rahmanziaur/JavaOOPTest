import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 3/16/15.
 */
public class Test {
    String value1, value2;

    public static void createAndShowGUI()
    {
        JFrame jFrame = new JFrame("My JFrame");
        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 5));


        final JTextField jTextField = new JTextField(17);
        final JTextField jTextField1 = new JTextField(17);
         JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton equal = new JButton("=");

        jFrame.add(jTextField);
        jTextField.setVisible(true);
        jFrame.add(jTextField1);
        jTextField1.setVisible(false);
        jFrame.add(add);
        jFrame.add(sub);
        jFrame.add(equal);

        //Action Listener


        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Test test = new Test();
                test.value1 = jTextField.getText();
                test.value2 = jTextField1.getText();
                System.out.println(test.value1+" "+test.value2);
                jTextField.setVisible(false);
                jTextField1.setVisible(true);

            }
        });

        jFrame.setSize(300, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);



    }

    public static void main(String[] arg)
    {
        createAndShowGUI() ;
    }
}
