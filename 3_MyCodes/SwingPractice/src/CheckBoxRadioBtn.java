import org.omg.CORBA._IDLTypeStub;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class CheckBoxRadioBtn implements ActionListener, ItemListener
{
    JFrame jFrame;
    JPanel jPanel;
    JLabel checkbox1, radioLabel, newLine;
    JCheckBox jCheckBox1, jCheckBox2;
    JButton jButton;
    JRadioButton radioButton1, radioButton2;


    public CheckBoxRadioBtn()
    {
        jFrame = new JFrame("Check Bo Radio Button Test");
        jPanel = new JPanel();

        checkbox1 = new JLabel("Do you Agree?");
        newLine = new JLabel("<html><br/></html>");

        jCheckBox1 = new JCheckBox("Agreed");
        jCheckBox2 = new JCheckBox("Not Agreed");

        radioLabel = new JLabel("Sex:");


        radioButton1 = new JRadioButton("Male");
        radioButton1.setSelected(false);
        radioButton1.addItemListener(this);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setSelected(true);
        radioButton2.addItemListener(this);



        jButton = new JButton("Submit");
        jButton.addActionListener(this);

        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5,7));
        jPanel.add(checkbox1);
        jPanel.add(jCheckBox1);
        jPanel.add(jCheckBox2);
        jPanel.add(newLine);


        jPanel.add(radioLabel);
        jPanel.add(radioButton1);
        jPanel.add(radioButton2);

        jPanel.add(jButton);

        jFrame.add(jPanel);
        jFrame.setSize(400,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setResizable(false);

    }

    public static void main(String[] arg)
    {
        new CheckBoxRadioBtn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(jButton))
        {
            System.out.println(jCheckBox1.isSelected());
            System.out.println(jCheckBox2.isSelected());
            System.out.println(radioButton1.isSelected());
            System.out.println(radioButton2.isSelected());

        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if(radioButton1.isSelected())
            radioButton2.setSelected(false);
        if (radioButton2.isSelected())
        {
            radioButton1.setSelected(false);
            radioButton2.setSelected(true);

        }



    }
}
