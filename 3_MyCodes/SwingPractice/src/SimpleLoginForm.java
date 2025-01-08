import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;



import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by User on 3/17/15.
 */
public class SimpleLoginForm implements ActionListener, MouseListener {

    JFrame jFrame;
    JPanel panel;
    JLabel userLabel, passwordLabel, registerLabel;
    JTextField username, password;
    //JPasswordField password;
    JButton loginBtn, closeBtn;
    Color color, colorRegister, colorEntered,colorReleased, colorPressed, colorClicked;
    Font font, fontRegister;


    public SimpleLoginForm()
    {
        jFrame = new JFrame("Login to Continue");
        panel = new JPanel();

        panel.setLayout(null);

        color = new Color(25, 22, 128);
        colorRegister = new Color(84, 206, 85);
        colorEntered = new Color(19, 32, 206);
        colorReleased = new Color(84, 206, 85);
        colorClicked = new Color(206, 47, 14);
        colorPressed = new Color(125, 126, 128);

        font = new Font("SanSerif", Font.BOLD,13);
        fontRegister = new Font("Times New Roman", Font.PLAIN,13);

        userLabel = new JLabel("User ");
        passwordLabel = new JLabel("Password ");
        registerLabel = new JLabel("Register");

        username = new JTextField(20);
        password = new JTextField(20);

        loginBtn = new JButton("Login");
        closeBtn = new JButton("Cancel");

        userLabel.setBounds(10, 10, 80, 25);
        passwordLabel.setBounds(10,40, 80, 25);
        username.setBounds(100, 10,160, 25 );
        password.setBounds(100,40,160,25);
        loginBtn.setBounds(10, 80, 80, 25);
        closeBtn.setBounds(170, 80, 90, 25);
        registerLabel.setBounds(112, 80,160,25 );

        userLabel.setForeground(color);
        userLabel.setFont(font);
        passwordLabel.setForeground(color);
        passwordLabel.setFont(font);
        loginBtn.setForeground(color);
        loginBtn.setFont(font);
        loginBtn.addActionListener(this);
        closeBtn.setForeground(color);
        closeBtn.setFont(font);
        closeBtn.addActionListener(this);
        registerLabel.setFont(fontRegister);
        registerLabel.setForeground(colorRegister);
        registerLabel.addMouseListener(this);

        panel.add(userLabel);
        panel.add(passwordLabel);
        panel.add(username);
        panel.add(password);
        panel.add(loginBtn);
        panel.add(closeBtn);
        panel.add(registerLabel);

        jFrame.add(panel);

        jFrame.setSize(300, 150);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(closeBtn))

        {
            jFrame.dispatchEvent(new WindowEvent(jFrame, WindowEvent.WINDOW_CLOSING));
            //jFrame.setVisible(false);
        }
        if(e.getSource().equals(loginBtn))
        {
            String thisUser, thisPassword;

            thisUser = username.getText();
            thisPassword = password.getText();

            String theUserName, theEmail, thePassword;

            File file = new File("zia.txt");
            try
            {
            Scanner scanner = new Scanner(file);

                while (scanner.hasNext())
                {
                   theUserName = scanner.next();
                    theEmail = scanner.next();
                    thePassword = scanner.next();

                    if(thisUser.equals(theUserName)&& thisPassword.equals(thePassword))
                    {
                       // System.out.println(thisUser+" "+theUserName+" "+thisPassword+" "+thePassword);
                         new Calculator();
                        jFrame.setVisible(false);
                    }
                    if (!thisUser.equals(theUserName)&& !thisPassword.equals(thePassword))
                    {
                        username.setText("");
                        password.setText("");
                    }

                }
            }
            catch (FileNotFoundException e1)
            {
                e1.printStackTrace();
            }

        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==registerLabel)
        {
            registerLabel.setForeground(colorClicked);
            new SignUpJFrame();

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource()==registerLabel)
        {
            registerLabel.setForeground(colorPressed);
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource()==registerLabel)
        {
            registerLabel.setForeground(colorReleased);
        }


    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if(e.getSource()==registerLabel)
        {

            registerLabel.setForeground(colorEntered);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==registerLabel)
        {

           // registerLabel.setForeground(colorRegister);
        }

    }

    public static void main(String[] arg)
    {
        new SimpleLoginForm();
    }

}
