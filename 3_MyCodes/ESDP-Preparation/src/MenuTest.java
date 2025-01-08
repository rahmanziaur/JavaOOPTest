import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by User on 3/26/15.
 */
public class MenuTest implements ActionListener {


    private JFrame jFrame;
    private JPanel jPanel;
    private JMenuBar jmb;
    private JMenu file, edit, view, tools, window, help;
    private JMenuItem open, save, exit;
    private JTabbedPane jTabbedPane;
    public JTextField jTextField;
    private JLabel result;


    public void  MyMenuTest()
    {
         jFrame = new JFrame();
         jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

         jmb = new JMenuBar();

        file = new JMenu("File");
        edit = new JMenu("Edit");
        view = new JMenu("View");
        tools = new JMenu("Tools");
        window = new JMenu("Window");
        help = new JMenu("Help");

        open = new JMenuItem("Open");
        open.addActionListener(this);
        save = new JMenuItem("Save");
        save.addActionListener(this);
        exit = new JMenuItem("Exit");
        exit.addActionListener(this);



        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(exit);

        jmb.add(file);
        jmb.add(edit);
        jmb.add(view);
        jmb.add(tools);
        jmb.add(window);
        jmb.add(help);


        jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("Cities", new CitiesPanel());
        jTabbedPane.addTab("Colors", new ColorsPanel());
        jTabbedPane.addTab("Flavors", new FlavorsPanel());

        result = new JLabel("Your Selection:");

        jTextField = new JTextField(10);
        jTextField.setText("Select one!");
        result.setBounds(5, 50, 50,20);
        jTextField.setBounds(50, 250, 80, 20);

        jPanel.add(jTabbedPane);
        jPanel.add(result);
        jPanel.add(jTextField);




        jFrame.add(jPanel);
        jFrame.setJMenuBar(jmb);
        jFrame.setSize(350,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }

    public static void main(String[] arg)
    {
        MenuTest menuTest = new MenuTest();
        menuTest.MyMenuTest();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(exit))
                jFrame.dispatchEvent(new WindowEvent(jFrame, WindowEvent.WINDOW_CLOSING));
    }

}
