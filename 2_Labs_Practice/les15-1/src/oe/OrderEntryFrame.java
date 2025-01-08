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
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;

public class OrderEntryFrame extends JInternalFrame 
{
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  GridLayout gridLayout1 = new GridLayout();
  JPanel jPanel2 = new JPanel();
  JScrollPane jScrollPane1 = new JScrollPane();
  JLabel jLabel1 = new JLabel();
  JTextField orderIdTxt = new JTextField();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JTextField custIdTxt = new JTextField();
  private JTextField custNameTxt = new JTextField();
  private JTextField custAddressTxt = new JTextField();
  private JTextField custPhoneTxt = new JTextField();
  private JButton findBtn = new JButton();
  private JLabel jLabel6 = new JLabel();
  private JTextField prodIdTxt = new JTextField();
  private JButton addButton = new JButton();
  private JLabel jLabel7 = new JLabel();
  private JLabel orderDateLbl = new JLabel();
  private JLabel jLabel8 = new JLabel();
  private JLabel orderTotalLbl = new JLabel();
  private JList jList1 = new JList();

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
    orderIdTxt.setBounds(new Rectangle(69, 4, 59, 20));
    jLabel2.setText("Customer Id");
    jLabel2.setBounds(new Rectangle(15, 45, 70, 15));
    jLabel3.setText("Name");
    jLabel3.setBounds(new Rectangle(15, 65, 34, 14));
    jLabel4.setText("Address");
    jLabel4.setBounds(new Rectangle(15, 85, 55, 15));
    jLabel5.setText("Phone");
    jLabel5.setBounds(new Rectangle(15, 105, 45, 15));
    custIdTxt.setBounds(new Rectangle(80, 45, 60, 15));
    custIdTxt.setPreferredSize(new Dimension(74, 19));
    custNameTxt.setBounds(new Rectangle(80, 60, 120, 20));
    custAddressTxt.setBounds(new Rectangle(80, 80, 120, 20));
    custPhoneTxt.setBounds(new Rectangle(80, 100, 120, 20));
    findBtn.setText("Find");
    findBtn.setBounds(new Rectangle(145, 40, 60, 20));
    jLabel6.setText("Product Id");
    jLabel6.setBounds(new Rectangle(220, 85, 70, 15));
    prodIdTxt.setBounds(new Rectangle(290, 80, 80, 20));
    addButton.setText("Add");
    addButton.setBounds(new Rectangle(220, 105, 75, 20));
    jLabel7.setText("Order Date");
    jLabel7.setBounds(new Rectangle(220, 5, 60, 15));
    orderDateLbl.setBounds(new Rectangle(290, 5, 80, 20));
    orderDateLbl.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    jLabel8.setText("Order Total");
    jLabel8.setBounds(new Rectangle(220, 35, 65, 15));
    orderTotalLbl.setBounds(new Rectangle(290, 30, 80, 20));
    orderTotalLbl.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    jPanel2.add(orderTotalLbl, null);
    jPanel2.add(jLabel8, null);
    jPanel2.add(orderDateLbl, null);
    jPanel2.add(jLabel7, null);
    jPanel2.add(addButton, null);
    jPanel2.add(prodIdTxt, null);
    jPanel2.add(jLabel6, null);
    jPanel2.add(findBtn, null);
    jPanel2.add(custPhoneTxt, null);
    jPanel2.add(custAddressTxt, null);
    jPanel2.add(custNameTxt, null);
    jPanel2.add(custIdTxt, null);
    jPanel2.add(jLabel5, null);
    jPanel2.add(jLabel4, null);
    jPanel2.add(jLabel3, null);
    jPanel2.add(jLabel2, null);
    jPanel2.add(orderIdTxt, null);
    jPanel2.add(jLabel1, null);
    jPanel1.add(jPanel2, null);
    jScrollPane1.getViewport().add(jList1, null);
    jPanel1.add(jScrollPane1, null);
    this.getContentPane().add(jPanel1, BorderLayout.CENTER);
  }
}