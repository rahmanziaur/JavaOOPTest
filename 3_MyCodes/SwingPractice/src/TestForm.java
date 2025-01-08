import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;


/**
 * Created by User on 3/30/15.
 */
public class TestForm implements ActionListener, ItemListener {
    JFrame frame;
    JMenuBar menuBar;
    JMenu file, edit;
    JMenuItem open, save, copy, cut, paste;
    JTabbedPane jTabbedPane;
    JPanel jPanel1, jPanel2, jPanel3;
    JRadioButton rose, lily, sunflower;
    ButtonGroup bg;
    JCheckBox red, blue, green;
    JComboBox comboCity;
    JTextField tf1, tf2, tf3;




    public TestForm()
    {
        frame = new JFrame();
        menuBar = new JMenuBar();
        file = new JMenu("File");
        open = new JMenuItem("Open");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser();

                try {
                    File  dummy_file = new File(new File("D:\\").getCanonicalPath());
                    jFileChooser.setCurrentDirectory(dummy_file);
                    //jFileChooser.changeToParentDirectory();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                //jFileChooser.setCurrentDirectory(new File(new File("C:\\").getCanonicalFile()));
                int result = jFileChooser.showOpenDialog(jFileChooser);
                // System.out.println(result);

                try {
                    File selectedFile = jFileChooser.getSelectedFile();
                    Desktop.getDesktop().open(selectedFile);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        save = new JMenuItem("Save");

        edit = new JMenu("Edit");
        copy = new JMenuItem("Copy");
        cut = new JMenuItem("Cut");
        paste = new JMenuItem("Paste");


        file.add(open);
        file.addSeparator();
        file.add(save);

        edit.add(copy);
        edit.addSeparator();
        edit.add(cut);
        edit.addSeparator();
        edit.add(paste);

        menuBar.add(file);
        menuBar.add(edit);

        //Tab Pane

        jPanel1 = new JPanel();
        bg = new ButtonGroup();
        tf1 = new JTextField(20);


        rose = new JRadioButton("Rose");
        rose.addActionListener(this);
        bg.add(rose);
        lily = new JRadioButton("Lily");
        lily.addActionListener(this);
        bg.add(lily);
        sunflower = new JRadioButton("Sun Flower");
        sunflower.addActionListener(this);
        bg.add(sunflower);

        jPanel1.add(rose);
        jPanel1.add(lily);
        jPanel1.add(sunflower);
        jPanel1.add(tf1);


        jPanel2 = new JPanel();
        tf2 = new JTextField(20);

        red = new JCheckBox("Red");
        red.addActionListener(this);
        blue = new JCheckBox("Blue");
        blue.addActionListener(this);
        green = new JCheckBox("Green");
        green.addActionListener(this);
        jPanel2.add(red);
        jPanel2.add(blue);
        jPanel2.add(green);
        jPanel2.add(tf2);

        //Cities Tab pane

        jPanel3 = new JPanel();

        tf3 = new JTextField(20);
        comboCity = new JComboBox();
        comboCity.addItem("Dhaka");
        comboCity.addItem("Chittagong");
        comboCity.addItem("Sylhet");
        comboCity.addItemListener(this);
        jPanel3.add(comboCity);
        jPanel3.add(tf3);


        jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("Desktop",jPanel1);
        jTabbedPane.addTab("Color", jPanel2);
        jTabbedPane.addTab("Cities", jPanel3);

        frame.add(jTabbedPane);
        frame.setJMenuBar(menuBar);
        frame.setSize(300,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

    public static void main(String[] arg)
    {
        new TestForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(rose))
            tf1.setText(e.getActionCommand());
        if(e.getSource().equals(lily))
            tf1.setText(e.getActionCommand());
        if(e.getSource().equals(sunflower))
            tf1.setText(e.getActionCommand());


        if(e.getSource().equals(red))
            tf2.setText(e.getActionCommand());
        if(e.getSource().equals(blue))
            tf2.setText(e.getActionCommand());
        if(e.getSource().equals(green))
            tf2.setText(e.getActionCommand());
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource().equals(comboCity))
            tf3.setText((String) e.getItem());
    }
}
