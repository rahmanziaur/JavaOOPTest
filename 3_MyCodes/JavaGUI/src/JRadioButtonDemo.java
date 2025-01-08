import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="JRadioButtonDemo" width=300 height=50>
</applet>
*/
public class JRadioButtonDemo extends JApplet
        implements ActionListener {
    JTextField tf;
    public void init() {
// Get content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
// Add radio buttons to content pane
        JRadioButton b1 = new JRadioButton("A");
        b1.addActionListener(this);
        contentPane.add(b1);
        JRadioButton b2 = new JRadioButton("B");
        b2.addActionListener(this);
        contentPane.add(b2);
        JRadioButton b3 = new JRadioButton("C");
        b3.addActionListener(this);
        contentPane.add(b3);
// Define a button group
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
// Create a text field and add it
// to the content pane
        tf = new JTextField(5);
        contentPane.add(tf);
    }public void actionPerformed(ActionEvent ae) {
        tf.setText(ae.getActionCommand());
    }
}