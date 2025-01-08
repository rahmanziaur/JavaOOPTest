import javax.swing.*;

public class FlashingTextJFrame extends JApplet implements Runnable {
         private JLabel jlblText = new JLabel("Welcome", JLabel.CENTER);

         public FlashingTextJFrame() {
         add(jlblText);
             new Thread(this).start();

         }


         @Override /** Set the text on/off every 200 milliseconds */
        public void run()
           {
         try {
         while (true) {
             if (jlblText.getText()==null)
             {
                 jlblText.setText("welcome");

             }
             else
             {
                 jlblText.setText(null);
             }

             Thread.sleep(500);
         }
        }

        catch (InterruptedException ex) {
         }
         }

        }