import sun.tools.jar.resources.jar_fr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by User on 3/28/15.
 */
public class ImageTest implements ItemListener, ActionListener {

    JFrame jFrame;
    JMenuBar jMenuBar;
    JMenu file;
    JMenuItem open;
    JTabbedPane jTabbedPane;
    JPanel jPanel, jPanel1, jPanel2, jPanel3;
    ImageIcon imageIcon;
    JLabel jLabel, jLabel1;
    ImageIcon bd, in, jp, fr;
    JButton jButton;
    JCheckBox red, blue, green;
    JTextField jTextField, jTextField1, jTextField2;
    ButtonGroup bg, bg1;
    JRadioButton dhaka, mumbai, islamabad;
    JComboBox jComboBox;

    public ImageTest()
    {
        jFrame = new JFrame();
        jMenuBar = new JMenuBar();
        file = new JMenu("File");
        bd = new ImageIcon("bd.png");
        open = new JMenuItem("Open",bd);
        file.add(open);

        jTabbedPane = new JTabbedPane();

        jPanel = new JPanel();
        jPanel1 = new JPanel();


        fr = new ImageIcon("france.png");
    //   jButton = new JButton(fr);


        jButton = new JButton("Name", bd);
        jLabel1 = new JLabel("France", fr, JLabel.RIGHT);
        jPanel.setLayout(new FlowLayout());
        //jPanel.add(jLabel);
        jPanel.add(jLabel1);
        jPanel.add(jButton);
        bg = new ButtonGroup();
        red = new JCheckBox("Red");
        bg.add(red);
        red.addItemListener(this);
        blue = new JCheckBox("Blue");
        bg.add(blue);
        blue.addItemListener(this);
        green = new JCheckBox("Green");
        bg.add(green);
        green.addItemListener(this);
        jTextField = new JTextField(20);


        jPanel1.add(red);
        jPanel1.add(blue);
        jPanel1.add(green);
        jPanel1.add(jTextField);
        bg1 = new ButtonGroup();
        jPanel2 = new JPanel();
        dhaka = new JRadioButton("Dhaka");
        bg1.add(dhaka);
        dhaka.addActionListener(this);
        mumbai = new JRadioButton("Mumbai");
        bg1.add(mumbai);
        mumbai.addActionListener(this);
        islamabad = new JRadioButton("Islamabad");
        bg1.add(islamabad);
        islamabad.addActionListener(this);
        jTextField1 = new JTextField(20);

        jPanel2.add(dhaka);
        jPanel2.add(mumbai);
        jPanel2.add(islamabad);
        jPanel2.add(jTextField1);

        jPanel3 = new JPanel();
        jComboBox = new JComboBox();
        jComboBox.addItem("ICT");
        jComboBox.addItem("CSE");
        jComboBox.addItem("ESRM");
        jComboBox.addItem("CPS");
        jComboBox.addItemListener(this);

        jTextField2 = new JTextField(20);

        jPanel3.add(jComboBox);
        jPanel3.add(jTextField2);


        jMenuBar.add(file);

        jTabbedPane.addTab("Images",jPanel );
        jTabbedPane.addTab("Color",jPanel1 );
        jTabbedPane.addTab("Cities",jPanel2);
        jTabbedPane.addTab("Department",jPanel3);

        jFrame.add(jTabbedPane);
        jFrame.setJMenuBar(jMenuBar);

       // jFrame.add(jPanel);
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
    public static void main(String[] arg)
    {
        new ImageTest();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource().equals(red)||e.getSource().equals(blue)||e.getSource().equals(green))
        {
        JCheckBox mychk =(JCheckBox)e.getItem();
        jTextField.setText(mychk.getText());
        }
        if(e.getSource().equals(jComboBox))
            jTextField2.setText();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jTextField1.setText(e.getActionCommand());

    }
}
