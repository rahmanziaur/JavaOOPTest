import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="JComboBoxDemo" width=300 height=100>
</applet>
*/
public class JComboBoxDemo extends JApplet
        implements ItemListener {
    JLabel jl;
    ImageIcon ssc, ssc1, hsc, hsc1;
    public void init() {
// Get content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
// Create a combo box and add it
// to the panel
        JComboBox jc = new JComboBox();
        jc.addItem("ssc");
        jc.addItem("ssc1");
        jc.addItem("hsc");
        jc.addItem("hsc1");
        jc.addItemListener(this);
        contentPane.add(jc);
// Create label
        jl = new JLabel(new ImageIcon("ssc.jpg"));
        contentPane.add(jl);
    }
    public void itemStateChanged(ItemEvent ie) {
        String s = (String)ie.getItem();
        jl.setIcon(new ImageIcon(s+".jpg"));
    }
}