package oe;

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

//  3a
    Customer customer1 = new Customer();
    Customer customer2 = new Customer();

//  3b
    customer1.setId(1);
    customer1.setName("Gary Williams");
    customer1.setAddress("Houston, TX");
    customer1.setPhone("713.555.8765");

    customer2.setId(2);
    customer2.setName("Lynn Munsinger");
    customer2.setAddress("Orlando, FL");
    customer2.setPhone("407.695.2210");

//  3c
    System.out.println("\nCustomers:");
    System.out.println(customer1.toString());
    System.out.println(customer2);

//  4 
    order.setCustomer(customer1);
    order.showOrder();
 }
}