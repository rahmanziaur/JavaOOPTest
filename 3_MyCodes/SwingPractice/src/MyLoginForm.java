import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * Created by User on 3/25/15.
 */
public class MyLoginForm {

    JFrame myFrame;
    JPanel jPanel;
    JLabel usernameLabel, emailLabel ;
    JTextField username, email;
    JButton submitBtn;



    public MyLoginForm()
    {
        myFrame = new JFrame("My Login Frame");
        jPanel = new JPanel();
        usernameLabel = new JLabel("Username");
        emailLabel = new JLabel("Email");
        username = new JTextField(20);
        email = new JTextField(20);
        submitBtn = new JButton("Submit");

        jPanel.setLayout(null);

        usernameLabel.setBounds(10, 10, 80, 25);
        emailLabel.setBounds(10,40, 80, 25);
        username.setBounds(100, 10,160, 25 );
        email.setBounds(100,40,160,25);
        submitBtn.setBounds(170, 80, 90, 25);

        jPanel.add(usernameLabel);
        jPanel.add(emailLabel);
        jPanel.add(username);
        jPanel.add(email);
        jPanel.add(submitBtn);

        myFrame.add(jPanel);
        myFrame.setSize(400,300);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

    public static void main(String[] arg)
    {
        new MyLoginForm();
    }
}
