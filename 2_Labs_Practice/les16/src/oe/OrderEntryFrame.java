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
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class OrderEntryFrame extends JInternalFrame 
{
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  GridLayout gridLayout1 = new GridLayout();
  JPanel jPanel2 = new JPanel();
  JScrollPane jScrollPane1 = new JScrollPane();
  JLabel jLabel1 = new JLabel();
  JTextField orderIdTxt = new JTextField();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JTextField custIdTxt = new JTextField();
  JTextField custNameTxt = new JTextField();
  JTextField custAddressTxt = new JTextField();
  JTextField custPhoneTxt = new JTextField();
  JButton findBtn = new JButton();
  JLabel jLabel6 = new JLabel();
  JTextField prodIdTxt = new JTextField();
  JButton addBtn = new JButton();
  JButton removeBtn = new JButton();
  JLabel jLabel7 = new JLabel();
  JLabel orderDateLbl = new JLabel();
  JLabel jLabel8 = new JLabel();
  JLabel orderTotalLbl = new JLabel();
  JList orderItemList = new JList();
  Order order = null;
  private static int x = 0;
  private static int y = 0;
  private static final int OFFSET = 20;
  private static final int MAX_OFFSET = 200;
  JLabel taxTextLbl = new JLabel();
  JLabel totalTaxLbl = new JLabel();

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
    jLabel1.setBounds(new Rectangle(5, 5, 59, 16));
    orderIdTxt.setBounds(new Rectangle(75, 5, 59, 20));
    jLabel2.setText("Customer Id");
    jLabel2.setBounds(new Rectangle(3, 28, 71, 16));
    jLabel3.setText("Name");
    jLabel3.setBounds(new Rectangle(5, 50, 57, 16));
    jLabel4.setText("Address");
    jLabel4.setBounds(new Rectangle(5, 70, 59, 16));
    jLabel5.setText("Phone");
    jLabel5.setBounds(new Rectangle(5, 90, 34, 16));
    custIdTxt.setBounds(new Rectangle(75, 30, 59, 20));
    custNameTxt.setBounds(new Rectangle(75, 50, 140, 20));
    custAddressTxt.setBounds(new Rectangle(75, 70, 140, 20));
    custPhoneTxt.setBounds(new Rectangle(75, 90, 140, 20));
    findBtn.setText("Find");
    findBtn.setBounds(new Rectangle(137, 27, 73, 21));
    findBtn.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          findBtn_actionPerformed(e);
        }
      });
    jLabel6.setText("Product Id");
    jLabel6.setBounds(new Rectangle(230, 70, 59, 16));
    prodIdTxt.setBounds(new Rectangle(295, 68, 85, 20));
    addBtn.setText("Add");
    addBtn.setBounds(new Rectangle(230, 90, 55, 23));
    addBtn.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          addBtn_actionPerformed(e);
        }
      });
    removeBtn.setEnabled(false);
    removeBtn.setText("Remove");
    removeBtn.setBounds(new Rectangle(295, 90, 85, 23));
    removeBtn.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          removeBtn_actionPerformed(e);
        }
      });
    jLabel7.setText("Order Date");
    jLabel7.setBounds(new Rectangle(230, 5, 63, 16));
    orderDateLbl.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    orderDateLbl.setBounds(new Rectangle(295, 5, 85, 16));
    jLabel8.setText("Order Total");
    jLabel8.setBounds(new Rectangle(230, 25, 61, 16));
    orderTotalLbl.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    orderTotalLbl.setBounds(new Rectangle(295, 25, 85, 16));
    orderItemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    orderItemList.addListSelectionListener(new ListSelectionListener()
      {
        public void valueChanged(ListSelectionEvent e)
        {
          orderItemList_valueChanged(e);
        }
      });
    taxTextLbl.setText("Total Tax");
    taxTextLbl.setBounds(new Rectangle(230, 45, 65, 16));
    totalTaxLbl.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    totalTaxLbl.setBounds(new Rectangle(295, 45, 85, 16));
    jPanel2.add(totalTaxLbl, null);
    jPanel2.add(taxTextLbl, null);
    jPanel2.add(orderTotalLbl, null);
    jPanel2.add(jLabel8, null);
    jPanel2.add(orderDateLbl, null);
    jPanel2.add(jLabel7, null);
    jPanel2.add(removeBtn, null);
    jPanel2.add(addBtn, null);
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
    jScrollPane1.getViewport().add(orderItemList, null);
    jPanel1.add(jScrollPane1, null);
    this.getContentPane().add(jPanel1, BorderLayout.CENTER);
    initOrder();
    setBounds();
    taxTextLbl.setVisible(false);
    totalTaxLbl.setVisible(false);
  }

  private void initOrder()
  {
    order = new Order();
    orderIdTxt.setText(Integer.toString(order.getId()));
    orderDateLbl.setText(Util.toDateString(order.getOrderDate()));
    orderTotalLbl.setText(Util.toMoney(order.getOrderTotal()));
  }

  private void setBounds()
  {
    this.setResizable(true);
    this.setBounds(x, y, this.getWidth(), this.getHeight());
    x = (x + OFFSET) % MAX_OFFSET;
    y = (y + OFFSET) % MAX_OFFSET;    
  }

  public void setActive(boolean active)
  {
    try
    {
      this.setSelected(active);
    }
    catch (Exception e) {}
    this.setVisible(active);
    if (active)
    {
      this.toFront();
    }
  }

  void findBtn_actionPerformed(ActionEvent e)
  {
    int custId = 0;
    Customer customer = null;

    if (custIdTxt.getText().length() > 0)
    {
      try
      {
        custId = Integer.parseInt(custIdTxt.getText());
        customer=DataMan.selectCustomerById(custId);
        //customer = DataMan.findCustomerById(custId);
        order.setCustomer(customer);
        custNameTxt.setText(customer.getName());
        custAddressTxt.setText(customer.getAddress());
        custPhoneTxt.setText(customer.getPhone());
      }
      catch (NumberFormatException err)
      {
        JOptionPane.showMessageDialog(this,
          "The Customer Id: " + err.getMessage() + " is not a valid number",
          "Error", JOptionPane.ERROR_MESSAGE);
        custIdTxt.setText("");
      }
      catch (Exception err)
      {
        JOptionPane.showMessageDialog(this, err.getMessage(),
          "Error", JOptionPane.ERROR_MESSAGE);
        custIdTxt.setText("");        
      }
    }    else
    {
      JOptionPane.showMessageDialog(this, "Please enter a Customer Id", "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

  void addBtn_actionPerformed(ActionEvent e)
  {
    Product p = null;
    int prodId = 0;

    if (prodIdTxt.getText().length() > 0)
    {
      try
      {
        prodId = Integer.parseInt(prodIdTxt.getText());
        p = DataMan.findProductById(prodId);
        order.addOrderItem(prodId);
        if (orderItemList.getModel().getSize() == 0)
        {
          orderItemList.setModel(order.getModel());
        }
        orderItemList.updateUI();
        orderTotalLbl.setText(Util.toMoney(order.getOrderTotal()));
        showTaxFields();     
      }
      catch (Exception err)
      {
        String message = err.getMessage();
        if (err instanceof NumberFormatException)
        {
          message = "Product Id '" + message + "' is not a valid number";
        }
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
        prodIdTxt.setText("");
      }
    }    else
    {
      JOptionPane.showMessageDialog(this, "Please enter a Product Id", "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

  void orderItemList_valueChanged(ListSelectionEvent e)
  {
    if (orderItemList.isSelectionEmpty())
    {
      removeBtn.setEnabled(false);
    }    else
    {
      removeBtn.setEnabled(true);
    }
  }

  void removeBtn_actionPerformed(ActionEvent e)
  {
    OrderItem item = (OrderItem) orderItemList.getSelectedValue();
    order.removeOrderItem(item.getProduct().getId());
    orderItemList.updateUI();
    orderTotalLbl.setText(Util.toMoney(order.getOrderTotal()));
    showTaxFields();
    if (orderItemList.isSelectionEmpty())
    {
      removeBtn.setEnabled(false);
    }
  }

  private void showTaxFields()
  {
    if (order.getTax() > 0.0) 
    {
      totalTaxLbl.setText(Util.toMoney(order.getTax()));
      orderTotalLbl.setText(Util.toMoney(order.getTax() + order.getOrderTotal()));
      taxTextLbl.setVisible(true);
      totalTaxLbl.setVisible(true);
    }
    else
    {
      taxTextLbl.setVisible(false);
      totalTaxLbl.setVisible(false);
    }
  }
}