import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.*;

public class DescriptionPanel extends JPanel {
    private JLabel jlblImageTitle = new JLabel();
    private JTextArea jtaDescription = new JTextArea();
    public DescriptionPanel() {
        jlblImageTitle.setHorizontalAlignment(JLabel.CENTER);
        jlblImageTitle.setHorizontalTextPosition(JLabel.CENTER);
        jlblImageTitle.setVerticalTextPosition(JLabel.BOTTOM);
        jlblImageTitle.setFont(new Font("SansSerif", Font.BOLD, 16));
        jtaDescription.setFont(new Font("Serif", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(jtaDescription);
        setLayout(new BorderLayout(5, 5));
        add(scrollPane, BorderLayout.CENTER);
        add(jlblImageTitle, BorderLayout.WEST);
    }
    public void setTitle(String title) {
         jlblImageTitle.setText(title);
         }

    public void setImageIcon(ImageIcon icon) {
         jlblImageTitle.setIcon(icon);
         }

    public void setDescription(String text) {
         jtaDescription.setText(text);
         }
}