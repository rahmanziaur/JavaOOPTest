package oe;

public class Order
{
  private int    id;
  //String orderDate;
  private int day;
  private int month;
  private int year;
  private String shipMode;
  private double orderTotal;
  private String status;
  private Customer customer;
  private OrderItem item1 = new OrderItem();
  private OrderItem item2 = new OrderItem();

  public int getId()
  {
    return id;
  }

  public String getOrderDate()
  {
    return day + "/" + month + "/" + year; //orderDate;
  }

  public String getShipDate(char region)
  {
    int daysToShip = Util.getDaysToShip(region);
    int dueDay = day + daysToShip;
    int dueMonth = month;
    int dueYear = year;
    int daysInMonth = Util.lastDayInMonth(month, year);

    if (dueDay > daysInMonth)
    {
      dueDay -= daysInMonth;
      dueMonth++;
      if (dueMonth > 12)
      {
        dueMonth = 1;
        dueYear++;
      }
    }
    return dueDay + "/" + dueMonth + "/" + dueYear;
  }

  public String getShipMode()
  {
    return shipMode;
  }

  public double getOrderTotal()
  {
    double item1Total, item2Total;

    item1.setLineNbr(1);
    item1.setQuantity(2);
    item1.setUnitPrice(2.95);

    item2.setLineNbr(2);
    item2.setQuantity(2);
    item2.setUnitPrice(3.50);

    item1Total = item1.getItemTotal();
    item2Total = item2.getItemTotal();
    // System.out.println("Item 1 Total: " + item1Total);
    // System.out.println("Item 2 Total: " + item2Total);

    orderTotal = item1Total + item2Total;

    return orderTotal;
  }

  public String getstatus()
  {
    return status;
  }

  public void setId(int newId)
  {
    id = newId;
  }

  public void setOrderDate(int d, int m, int y)
  {
    int daysInMonth = Util.lastDayInMonth(m, y);
    
    day = 0;
    month = 0;
    year = 0;
    if (d > 0 && d <= daysInMonth)
    {
      if ((m > 0 && m <= 12) && (y > 0))
      {
         day = d;
         month = m;
         year = y;
      }
    }
  }

  public void setShipMode(String newShipMode)
  {
    shipMode = newShipMode;
  }

  public void setOrderTotal(double newOrderTotal)
  {
    orderTotal = newOrderTotal;
  }

  public void setStatus(String newStatus)
  {
    status = newStatus;
  }

  public Customer getCustomer()
  {
    return customer;
  }

  public void setCustomer(Customer newCustomer)
  {
    customer = newCustomer;
  }

  public String toString()
  {
    return "Order: " + id + " Date: " +
            getOrderDate() + " Total: $" + getOrderTotal();
  }

  public void showOrder()
  {
    System.out.println(toString());
    if (customer != null) 
    { 
      System.out.println("Customer: " + customer);
    }
    System.out.println("Items:");
    if (item1 != null) 
    { 
      System.out.println(item1.toString());
    }
    if (item2 != null) 
    { 
      System.out.println(item2);
    }

  }

}