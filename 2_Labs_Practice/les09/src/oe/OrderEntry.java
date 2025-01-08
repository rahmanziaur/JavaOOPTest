package oe;

import java.util.Date;

public class OrderEntry 
{
  public static void main(String[] args)
  {
    Order   order = new Order();
    double  orderTotal;
    boolean exceedsLimit;
    double  taxRate = 0.0825;
    double  taxValue;

    System.out.println("Order Entry Application");
    orderTotal = order.getOrderTotal();
    System.out.println("Order Total: " + orderTotal);
    
    taxValue = orderTotal * taxRate;
    System.out.println("Tax Value:   " + taxValue);

    orderTotal += taxValue;
    System.out.println("Final Total: " + orderTotal);

    exceedsLimit = orderTotal > 10.00;
    System.out.println("Total Exceeds $10.00: " + exceedsLimit);

    // order.setOrderDate(27, 1, 2001);
    order.setOrderDate(27, 2, 2001);
    char region = 'A';
    String shipDate = order.getShipDate(region);
    System.out.println("Order Date:         " + order.getOrderDate());
    System.out.println("Days till shipping: " + Util.getDaysToShip(region));
    System.out.println("Expected Ship Date: " + shipDate);

    System.out.println("\nCustomers:");
    System.out.println(DataMan.customer1.toString());
    System.out.println(DataMan.customer2);

    order.setCustomer(DataMan.customer3);
    order.showOrder();

    // Order order2 = new Order(new Date(), "overnight");
    Order order2 = new Order(Util.getDate(7, 3, 2002), "overnight");
    order2.setCustomer(DataMan.customer4);
    order2.showOrder();    
 }
}