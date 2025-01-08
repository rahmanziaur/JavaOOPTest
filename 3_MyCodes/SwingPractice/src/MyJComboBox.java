import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;


import java.awt.event.ActionEvent;
import java.awt.event.*;


/**
 * Created by User on 3/18/15.
 */
public class MyJComboBox  implements ActionListener {

    JFrame comboFrame, comboFrame1;
    JPanel comboPanel;
    JLabel jLabel, imageLabel, testImage;
    JComboBox jComboBox;
    JButton jButton;
    ImageIcon i1;

    ImageIcon[] flagImage = {new ImageIcon("bd.gif"),new ImageIcon("india.gif")};
    String[] country = {"Bangladesh","India"};


    public MyJComboBox()
    {
        comboFrame =new JFrame("Combo Box Display");
        comboPanel = new JPanel();
        i1 = new ImageIcon("bd.gif");
        jLabel = new JLabel("Select your Country");
        testImage =new JLabel("Bangladesh",i1,JLabel.CENTER);



        jComboBox = new JComboBox(country);
        jButton = new JButton("Submit");



        jLabel.setBounds(30,10,200,25);
        jComboBox.setBounds(200, 10, 100,25);
        jButton.setBounds(330, 10, 80, 25);
        testImage.setBounds(30,200,200,25);

        jButton.addActionListener(this);


        comboPanel.setLayout(null);
        comboPanel.add(jLabel);
        comboPanel.add(jComboBox);
        comboPanel.add(jButton);
        comboPanel.add(testImage);



        comboFrame.add(comboPanel);
        comboFrame.setSize(600, 500);
        comboFrame.setLocationRelativeTo(null);
        comboFrame.setDefaultCloseOperation(comboFrame.EXIT_ON_CLOSE);
        comboFrame.setVisible(true);


    }

    public static void main(String[] arg)
    {
        new MyJComboBox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(jButton))
        {
            /*comboFrame1 =new JFrame("Combo Box Display");

            int index = jComboBox.getSelectedIndex();
            System.out.println(country[index]+" "+flagImage[index]);
            imageLabel = new JLabel(country[index],flagImage[index],JLabel.CENTER);
            imageLabel.setBounds(50, 10, 300,100);
            comboPanel.add(imageLabel);

            comboFrame1.add(comboPanel);
            comboFrame1.setSize(600, 500);
            comboFrame1.setLocationRelativeTo(null);
            comboFrame1.setDefaultCloseOperation(comboFrame.EXIT_ON_CLOSE);
            comboFrame1.setVisible(true);*/


        }

    }
}
