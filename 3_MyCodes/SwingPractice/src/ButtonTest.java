import sun.tools.jar.resources.jar_de;
import sun.tools.jar.resources.jar_zh_TW;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by User on 3/15/15.
 */
public class ButtonTest {
    String msg;
    static JTextField jtf;
    static ButtonTest buttonTest;

public static void CreateAndShowGUI()
{

       final JFrame jFrame = new JFrame("My Frame");
        jFrame.setLayout(new FlowLayout(FlowLayout.LEADING, 2,5));

        JButton jButton = new JButton("Submit");
        JButton jButtonEditFile = new JButton("Edit File");
        JButton createFile = new JButton("New File");

       JLabel jLabel = new JLabel("Message");
      final JTextField textField = new JTextField(20);
   final JDialog jDialog = new JDialog();

        jFrame.add(jButton);


       // jButton.setActionCommand("Submit");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Button Pressed");
                //jFrame.setVisible(false);


                 JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = jFileChooser.showOpenDialog(jFileChooser);
                File selectedFile = jFileChooser.getSelectedFile();
                textField.setText(selectedFile.getAbsolutePath());
            }
        });

    jFrame.add(jLabel);
    jFrame.add(textField);

    jFrame.add(jButtonEditFile);


    jButtonEditFile.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            int result = jFileChooser.showOpenDialog(jFileChooser);
            File selectedFile = jFileChooser.getSelectedFile();
            String location = String.valueOf(selectedFile);
            //textField.setText(selectedFile.getAbsolutePath());
            File file = new File(location);
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("Maa Assalam");
                fileWriter.close();

                Desktop.getDesktop().open(selectedFile);
            } catch (IOException ex) {
                ex.printStackTrace();
            }


        }
    });

    jFrame.add(createFile);
    final JLabel fileTile = new JLabel("Enter File Name:");
    final JTextField fileName = new JTextField(10   );
    jFrame.add(fileTile);
    jFrame.add(fileName);
     String fn;
    final JButton newFileCreate = new JButton("Create");
    jFrame.add(newFileCreate);


    fileTile.setVisible(false);
    fileName.setVisible(false);
    newFileCreate.setVisible(false);

    createFile.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            fileTile.setVisible(true);
            fileName.setVisible(true);
            newFileCreate.setVisible(true);
        }
    });

    newFileCreate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            File file = new File(fileName.getText()+".txt");
            try {
                file.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    });



    jFrame.pack();
    jFrame.setSize(400, 400);
    jFrame.setLocationRelativeTo(null);
    jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    jFrame.setVisible(true);
    //jFrame.setMinimumSize();
    //jFrame.setMaximumSize();
    //System.out.println("Salam");
    }



    public static void main(String[] arg)
    {
       /* javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CreateAndShowGUI();

            }
        });*/

        CreateAndShowGUI();
    }
}
