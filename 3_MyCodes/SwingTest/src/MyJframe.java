import javax.swing.JFrame;

/**
 * Created by User on 3/16/15.
 */
public class MyJframe {

    public static void main(String[] arg)
    {
        JFrame jFrame = new JFrame("My First Frame in Swing");

        jFrame.setSize(300, 400);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
