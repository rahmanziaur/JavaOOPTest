import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by User on 3/27/15.
 */
public class TabTest implements ActionListener, ItemListener {
    JFrame jFrame;
    JTabbedPane jTabbedPane;
    JPanel jPanelCity, jPanelColor;
    JMenuBar jmb;
    JMenu file;
    JMenuItem open;
    JTextField jTextFieldCities, jTextFieldColor;
    JCheckBox cb1, cb2, cb3;

    public TabTest()
    {
        jFrame = new JFrame();

        jmb = new JMenuBar();
        file = new JMenu("File");
        open = new JMenuItem("Open");
        file.add(open);
        jmb.add(file);

        jTabbedPane = new JTabbedPane();
        jPanelCity = new JPanel();
        jPanelColor = new JPanel();

        JButton b1 = new JButton("New York");
        b1.addActionListener(this);
        jPanelCity.add(b1);
        JButton b2 = new JButton("London");
        b2.addActionListener(this);
        jPanelCity.add(b2);
        JButton b3 = new JButton("Hong Kong");
        b3.addActionListener(this);
        jPanelCity.add(b3);
        JButton b4 = new JButton("Tokyo");
        b4.addActionListener(this);
        jPanelCity.add(b4);
        jTextFieldCities = new JTextField(20);
        jPanelCity.add(jTextFieldCities);


        ButtonGroup bg = new ButtonGroup();
         cb1 = new JCheckBox("Red");
        bg.add(cb1);
        cb1.addItemListener(this);
        jPanelColor.add(cb1);
         cb2 = new JCheckBox("Green");
        bg.add(cb2);
        cb2.addItemListener(this);
        jPanelColor.add(cb2);
         cb3 = new JCheckBox("Blue");
        bg.add(cb3);
        cb3.addItemListener(this);
        jPanelColor.add(cb3);
        jTextFieldColor = new JTextField(20);
        jPanelColor.add(jTextFieldColor);

        jTabbedPane.addTab("Cities", jPanelCity);
        jTabbedPane.addTab("Color",jPanelColor);

        jFrame.setJMenuBar(jmb);
        jFrame.add(jTabbedPane);
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }


    public static void main(String[] arg)
    {
        new TabTest();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jTextFieldCities.setText(e.getActionCommand());

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if(e.getSource().equals(cb1))
        jTextFieldColor.setText("Red");

        if(e.getSource().equals(cb2))
            jTextFieldColor.setText("Green");

        if(e.getSource().equals(cb3))
            jTextFieldColor.setText("Blue");
    }
}


