import sun.security.util.Password;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by User on 3/17/15.
 */
public class SignUpJFrame implements ActionListener {
    JFrame signUpFrame;
    JPanel signUpPanel;
    JLabel usernameLabel, emailAddressLabel, passwordLabel;
    JTextField username, emailAddress, userPassword;
    //JPasswordField userPassword;
    JButton registerBtn, closeBtn;


    public  SignUpJFrame() {
        signUpFrame = new JFrame("Sign Up Please!");
        signUpPanel = new JPanel();
        usernameLabel = new JLabel("Userername");
        emailAddressLabel = new JLabel("Email ");
        passwordLabel = new JLabel("Password");
        username = new JTextField(20);
        emailAddress = new JTextField(20);
        userPassword = new JTextField(20);
        registerBtn = new JButton("Sign up");
        closeBtn = new JButton("Cancel");

        usernameLabel.setBounds(10, 10, 80, 25);
        emailAddressLabel.setBounds(10,40, 80, 25);
        passwordLabel.setBounds(10, 70, 80, 25);
        username.setBounds(100, 10,160, 25 );
        emailAddress.setBounds(100,40,160,25);
        userPassword.setBounds(100, 70, 160, 25);
        registerBtn.setBounds(10, 100, 80, 25);
        registerBtn.addActionListener(this);
        closeBtn.setBounds(170, 100, 90, 25);
        closeBtn.addActionListener(this);

        signUpPanel.add(usernameLabel);
        signUpPanel.add(emailAddressLabel);
        signUpPanel.add(username);
        signUpPanel.add(emailAddress);
        signUpPanel.add(registerBtn);
        signUpPanel.add(passwordLabel);
        signUpPanel.add(userPassword);
        signUpPanel.add(closeBtn);


        signUpPanel.setLayout(null);
        signUpFrame.add(signUpPanel);
        signUpFrame.setSize(300, 160);
        signUpFrame.setLocationRelativeTo(null);
        signUpFrame.setDefaultCloseOperation(signUpFrame.EXIT_ON_CLOSE);
        signUpFrame.setVisible(true);
        signUpFrame.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(registerBtn))
        {
            String un, email, myPass;
            //  signUpFrame.dispatchEvent(new WindowEvent(signUpFrame, WindowEvent.WINDOW_CLOSING));
           // signUpFrame.setVisible(false);
            un = username.getText();
            email = emailAddress.getText();
            myPass = userPassword.getText();

            File file = new File("zia.txt");
            try {
                FileWriter fileWriter = new  FileWriter(file, true);
                fileWriter.write(un+" "+email+" "+myPass+"\n");
                fileWriter.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

           signUpFrame.setVisible(false);

        }
        if(e.getSource().equals(closeBtn))
        {
            signUpFrame.setVisible(false);
        }

    }
   /* public static void main(String[] arg)
    {
        new SignUpJFrame();
    }*/
}
