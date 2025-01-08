package oe;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;

public class OrderEntryFrame extends JInternalFrame 
{
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  GridLayout gridLayout1 = new GridLayout();
  JPanel jPanel2 = new JPanel();
  JScrollPane jScrollPane1 = new JScrollPane();
  JLabel jLabel1 = new JLabel();
  JTextField jTextField1 = new JTextField();

  public OrderEntryFrame()
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
    this.setTitle("Order");
    this.setBounds(0, 0, 400, 300);
    this.setMaximizable(true);
    this.setIconifiable(true);
    this.setClosable(true);
    this.getContentPane().setLayout(borderLayout1);
    jPanel1.setLayout(gridLayout1);
    gridLayout1.setColumns(1);
    gridLayout1.setRows(2);
    jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    jPanel2.setLayout(null);
    jLabel1.setText("Order Id");
    jLabel1.setBounds(new Rectangle(5, 4, 59, 16));
    jTextField1.setBounds(new Rectangle(69, 4, 59, 20));
    jPanel2.add(jTextField1, null);
    jPanel2.add(jLabel1, null);
    jPanel1.add(jPanel2, null);
    jPanel1.add(jScrollPane1, null);
    this.getContentPane().add(jPanel1, BorderLayout.CENTER);
  }
}