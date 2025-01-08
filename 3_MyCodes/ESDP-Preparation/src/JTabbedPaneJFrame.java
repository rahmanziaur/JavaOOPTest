import javax.swing.*;
/*
<applet code="JTabbedPaneDemo" width=400 height=100>
</applet>
*/
public class JTabbedPaneJFrame  {

    public JTabbedPaneJFrame()
    {
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities", new CitiesPanel1());
        jtp.addTab("Colors", new ColorsPanel1());
        jtp.addTab("Flavors", new FlavorsPanel1());

        JPanel jPanel = new JPanel();
        jPanel.add(jtp);

        JFrame jFrame = new JFrame();
        jFrame.add(jPanel);

        jFrame.setSize(500,150);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] arg) {

        new JTabbedPaneJFrame();
    }
}
class CitiesPanel1 extends JPanel {
    public CitiesPanel1() {
        JButton b1 = new JButton("New York");
        add(b1);
        JButton b2 = new JButton("London");
        add(b2);
        JButton b3 = new JButton("Hong Kong");
        add(b3);
        JButton b4 = new JButton("Tokyo");
        add(b4);
    }
}
class ColorsPanel1 extends JPanel {
    public ColorsPanel1() {JCheckBox cb1 = new JCheckBox("Red");
        add(cb1);
        JCheckBox cb2 = new JCheckBox("Green");
        add(cb2);
        JCheckBox cb3 = new JCheckBox("Blue");
        add(cb3);
        JButton colorPaneBtn = new JButton("Show");
        add(colorPaneBtn);
    }
}
class FlavorsPanel1 extends JPanel {
    public FlavorsPanel1() {
        JComboBox jcb = new JComboBox();
        jcb.addItem("Vanilla");
        jcb.addItem("Chocolate");
        jcb.addItem("Strawberry");
        add(jcb);
        JButton FlavorPaneBtn = new JButton("Show");
        add(FlavorPaneBtn);

    }
}