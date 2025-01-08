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
  JMenu menuOrder = new JMenu();
  JMenuItem newMenuItem = new JMenuItem();
  JMenuItem openMenuItem = new JMenuItem();
  JMenuItem saveMenuItem = new JMenuItem();
  JMenuItem closeMenuItem = new JMenuItem();
  JMenuItem printMenuItem = new JMenuItem();

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
  }

  private void jbInit() throws Exception
  {
    this.setJMenuBar(menuBar1);
    this.getContentPane().setLayout(borderLayout1);
    desktopPane.setLayout(null);
    menuOrder.setText("Order");
    newMenuItem.setText("New");
    newMenuItem.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          newMenuItem_actionPerformed(e);
        }
      });
    openMenuItem.setText("Open");
    saveMenuItem.setText("Save");
    closeMenuItem.setText("Close");
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
    menuOrder.add(newMenuItem);
    menuOrder.add(openMenuItem);
    menuOrder.add(saveMenuItem);
    menuOrder.add(closeMenuItem);
    menuOrder.addSeparator();
    menuOrder.add(printMenuItem);
    menuBar1.add(menuOrder);
    this.getContentPane().add(statusBar, BorderLayout.SOUTH);
    this.getContentPane().add(desktopPane, BorderLayout.CENTER);
  }

  void fileExit_ActionPerformed(ActionEvent e)
  {
    System.exit(0);
  }

  void newMenuItem_actionPerformed(ActionEvent e)
  {
    OrderEntryFrame iFrame = new OrderEntryFrame();
    //iFrame.setVisible(true);
    desktopPane.add(iFrame);
    iFrame.setActive(true);
  }
}