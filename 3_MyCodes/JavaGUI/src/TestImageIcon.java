import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 3/13/15.
 */
public class TestImageIcon extends JFrame {

    private ImageIcon sscCert = new ImageIcon("ssc.jpg");
    private ImageIcon sscMarks = new ImageIcon("ssc1.jpg");
    private ImageIcon hsccert = new ImageIcon("hsc.jpg");
    private ImageIcon hsc1 = new ImageIcon("hsc1.jpg");

    private TestImageIcon()
    {
        setLayout(new GridLayout(1,4,5,5));
        add(new JLabel(sscCert));
        add(new JLabel(sscMarks));
        add(new JLabel(hsccert));
        add(new JLabel(hsc1));

    }

    public static void main(String[] arg)
    {
        TestImageIcon imageIcon = new TestImageIcon();
        imageIcon.setTitle("Test Image Icon");
        imageIcon.setSize(200,300);
        imageIcon.setLocationRelativeTo(null);
        imageIcon.setDefaultCloseOperation(imageIcon.EXIT_ON_CLOSE);
        imageIcon.setVisible(true);
    }
}
