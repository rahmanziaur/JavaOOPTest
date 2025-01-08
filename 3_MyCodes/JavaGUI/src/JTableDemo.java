import java.awt.*;
import javax.swing.*;
/*
<applet code="JTableDemo" width=400 height=200>
</applet>
*/
public class JTableDemo extends JApplet {public void init() {
// Get content pane
    Container contentPane = getContentPane();
// Set layout manager
    contentPane.setLayout(new BorderLayout());
// Initialize column headings
    final String[] colHeads = { "Name", "Phone", "Fax" };
// Initialize data
    final Object[][] data = {
            { "Gail", "4567", "8675" },
            { "Ken", "7566", "5555" },
            { "Viviane", "5634", "5887" },
            { "Melanie", "7345", "9222" },
            { "Anne", "1237", "3333" },
            { "John", "5656", "3144" },
            { "Matt", "5672", "2176" },
            { "Claire", "6741", "4244" },
            { "Erwin", "9023", "5159" },
            { "Ellen", "1134", "5332" },
            { "Jennifer", "5689", "1212" },
            { "Ed", "9030", "1313" },
            { "Helen", "6751", "1415" }
    };
// Create the table
    JTable table = new JTable(data, colHeads);
// Add table to a scroll pane
    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    JScrollPane jsp = new JScrollPane(table, v, h);
// Add scroll pane to the content pane
    contentPane.add(jsp, BorderLayout.CENTER);
}
}