import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
<applet code="JTabbedPaneDemo" width=400 height=100>
</applet>
*/
public class JTabbedPaneDemo extends JApplet {
    public void init() {
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities", new CitiesPanel1());
        jtp.addTab("Colors", new ColorsPanel1());
        jtp.addTab("Flavors", new FlavorsPanel1());
        getContentPane().add(jtp);
    }
}
class CitiesPanel extends JPanel implements ActionListener {

    JRadioButton b1,b2, b3;

    public CitiesPanel() {

        ButtonGroup buttonGroup = new ButtonGroup();

        b1 = new JRadioButton("New York");
        b1.addActionListener(this);
        buttonGroup.add(b1);
        add(b1);

        b2 = new JRadioButton("London");
        b2.addActionListener(this);
        buttonGroup.add(b2);
        add(b2);
        b3 = new JRadioButton("Hong Kong");
        b3.addActionListener(this);
        buttonGroup.add(b3);
        add(b3);
        JRadioButton b4 = new JRadioButton("Tokyo");
        b4.addActionListener(this);
        buttonGroup.add(b4);
        add(b4);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //if(e.getSource().equals(b1))
        System.out.println(e.getActionCommand());

     /*  MenuTest menuTest1 = new MenuTest();
        String text = "selected";
        System.out.println(text);
        menuTest1.jTextField.setText(text);*/


    }
}
class ColorsPanel extends JPanel implements ItemListener {
    JCheckBox cb1, cb2, cb3;
    public ColorsPanel() {

        ButtonGroup buttonGroup = new ButtonGroup();

         cb1 = new JCheckBox("Red");
        cb1.addItemListener(this);
        buttonGroup.add(cb1);
        add(cb1);
         cb2 = new JCheckBox("Green");
        cb2.addItemListener(this);
        buttonGroup.add(cb2);
        add(cb2);
         cb3 = new JCheckBox("Blue");
        cb3.addItemListener(this);
        buttonGroup.add(cb3);
        add(cb3);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println(e.getItem());

    }
}
class FlavorsPanel extends JPanel implements ItemListener{
    public FlavorsPanel() {
        JComboBox jcb = new JComboBox();
        jcb.addItem("Vanilla");
        jcb.addItem("Chocolate");
        jcb.addItem("Strawberry");

        jcb.addItemListener(this);
        add(jcb);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println(e.getItem());

    }
}