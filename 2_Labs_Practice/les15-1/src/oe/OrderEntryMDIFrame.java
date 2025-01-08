package oe;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;

public class OrderEntryMDIFrame extends JFrame 
{
  JLabel statusBar = new JLabel();
  JMenuItem menuFileExit = new JMenuItem();
  JMenu menuFile = new JMenu();
  JMenuBar menuBar1 = new JMenuBar();
  JDesktopPane desktopPane = new JDesktopPane();
  BorderLayout borderLayout1 = new BorderLayout();
  private JMenu jMenu1 = new JMenu();
  private JMenuItem jMenuItem1 = new JMenuItem();
  private JMenuItem jMenuItem2 = new JMenuItem();
  private JMenuItem jMenuItem3 = new JMenuItem();
  private JMenuItem jMenuItem4 = new JMenuItem();
  private JMenuItem printMenuItem = new JMenuItem();

  public OrderEntryMDIFrame()
  {
    try
    {
      jbInit();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    OrderEntryFrame iFrame = new OrderEntryFrame();
    iFrame.setVisible(true);
    desktopPane.add(iFrame);
  }

  private void jbInit() throws Exception
  {
    this.setJMenuBar(menuBar1);
    this.getContentPane().setLayout(borderLayout1);
    desktopPane.setLayout(null);
    jMenu1.setText("Order");
    jMenuItem1.setText("New");
    jMenuItem2.setText("Open");
    jMenuItem3.setText("Close");
    jMenuItem4.setText("Save");
    printMenuItem.setText("Print");
    this.setSize(new Dimension(700, 500));
    this.setTitle("Order Entry Application");
    menuFile.setText("File");
    menuFileExit.setText("Exit");
    menuFileExit.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent ae)
        {
          fileExit_ActionPerformed(ae);
        }
      });
    statusBar.setText("");
    menuFile.add(menuFileExit);
    menuBar1.add(menuFile);
    jMenu1.add(jMenuItem1);
    jMenu1.add(jMenuItem2);
    jMenu1.add(jMenuItem3);
    jMenu1.add(jMenuItem4);
    jMenu1.addSeparator();
    jMenu1.add(printMenuItem);
    menuBar1.add(jMenu1);
    this.getContentPane().add(statusBar, BorderLayout.SOUTH);
    this.getContentPane().add(desktopPane, BorderLayout.CENTER);
  }

  void fileExit_ActionPerformed(ActionEvent e)
  {
    System.exit(0);
  }
}