import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Ziaur Rahman on 3/26/15.
 */
public class RadioCheckTest extends JFrame  {
    JFrame jFrame;
    JPanel jPanel;
    JTabbedPane sex ,color;

    public  void MyRadioCheckTest()
    {
        jFrame = new JFrame("Assalamualykum");
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEFT));


        sex = new JTabbedPane();
        color = new JTabbedPane();

        sex.addTab("Sex", new SexTabPane());
        color.addTab("Color",new MyColor());

        jPanel.add(sex);
        jPanel.add(color);

        add(jPanel);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] arg)
    {
        RadioCheckTest myRadioCheckTest = new RadioCheckTest();
        myRadioCheckTest.MyRadioCheckTest();

    }

}

class SexTabPane extends JPanel implements ActionListener
{
    JLabel jLabel;
    JTextField jTextField;
    JRadioButton male, female;
    ButtonGroup bg;

    public SexTabPane()
    {
        jLabel = new JLabel("Sex");
        bg = new ButtonGroup();
        male = new JRadioButton("Male");
        bg.add(male);
        male.addActionListener(this);
        female = new JRadioButton("Female");
        bg.add(female);
        jTextField = new JTextField(7);
        female.addActionListener(this);

        //setLayout(new FlowLayout(FlowLayout.LEFT));
        add(jLabel);
        add(male);
        add(female);
        add(jTextField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jTextField.setText(e.getActionCommand());
    }


}

class MyColor extends JPanel implements ItemListener
{
    JTextField jTextField;
    JLabel theColor;
    JCheckBox red, blue, green;
    public MyColor()
    {
        theColor = new JLabel("Color");
        red = new JCheckBox("Red");
        red.addItemListener(this);
        blue = new JCheckBox("Blue");
        blue.addItemListener(this);
        green = new JCheckBox("Green");
        green.addItemListener(this);

        jTextField = new JTextField(7);

        //setLayout(new FlowLayout(FlowLayout.LEFT));

        add(jTextField);
        add(theColor);
        add(red);
        add(blue);
        add(green);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        jTextField.setText((String)e.getItem());
    }
}
