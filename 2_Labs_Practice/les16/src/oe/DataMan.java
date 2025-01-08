package oe;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
// 2a
import java.sql.*;

public class DataMan
{
  private static class ProductMap extends HashMap
  {
    public void add(Product p)
    {
      String key = Integer.toString(p.getId());
      put(key, p);
    }
  }
  
  private static Customer[] customers = null;
  private static ProductMap products = null;
  private static Connection conn = null;
  
  public static void buildCustomers()
  {
    if (customers != null) return;
    customers = new Customer[6];
    customers[0] = new Customer("Gary Williams", "Houston, TX", "713.555.8765");
    customers[1] = new Customer("Lynn Munsinger", "Orlando, FL", "407.695.2210");
    customers[2] = new Customer("Rachael O'leary", "Brisbane, QLD", "07.3031.1100");
    customers[3] = new Customer("Tony Obermeit", "Brisbane, QLD", "07.3031.9987");
    customers[4] = new Company("Oracle Corporation", "Redwood Shores, CA", "800-ORACLE-1", "Larry Ellison", 20);
    customers[5] = new Individual("Mel Gibson", "Hollywood, CA", "213.MEL.GIBSON", "MAD-MAX");
  }

  public static void buildProducts()
  {
    if (products != null) return;
    products = new ProductMap();
    products.add(new Hardware("SDRAM - 128 MB", null, 299.0));
    products.add(new Hardware("GP 800x600", null, 48.0));
    products.add(new Software("Spreadsheet-SSP/V2.0", null, 45.0));
    products.add(new Software("Word Processing-SWP/V4.5", null, 65.0));
    products.add(new Manual("Manual-Vision OS/2x +", null, 125.0));    
  }
  
  public static Customer findCustomerById(int custId) throws NotFoundException
  {
    Customer c = null;
    for (int i = 0; i < customers.length; i++)
    {
      if (customers[i].getId() == custId)
      {
        c = customers[i];
        break;
      }
    }
    if (c == null)
    {
      throw new NotFoundException("Customer with id " + custId + " does not exist");
    }
    return c;
  }

  public static Product findProductById(int id) throws NotFoundException
  {
    String key = Integer.toString(id);
    Product product = (Product) products.get(key);
    if (product == null)
    {
      throw new NotFoundException("Product with id " + id + " is not found");
    }
    return product;
  }

  public static List getCustomers()
  {
    return Arrays.asList(customers);
  }

  public static List getProducts()
  {
    return Arrays.asList(products.values().toArray());
  }
  
  static 
  {
    buildCustomers();
    buildProducts();

    try
    {
      // 2c Register the Oracle JDBC driver
    	DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
      // 2c Connect to the database 
      // (replace HOST_VALUE and SID by the appropriate values)
      // ------------------------------------------------------
      String url = "jdbc:oracle:thin:@localhost:1521:oe";
      // (replace username and passowrd by the appropriate values)
      // ------------------------------------------------------
	    conn = DriverManager.getConnection (url, "oe","oracle");
      
     	conn.setAutoCommit (false);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }

  public static Customer selectCustomerById(int id) throws Exception
  {
    Customer customer = null;
    
    // 3a Create a Select Statement
  	Statement stmt = conn.createStatement ();
	  System.out.println("Table Customers query for customer with id: " + id);
	  ResultSet rset = stmt.executeQuery ("SELECT cust_last_name, nls_territory " +
                                        "FROM customers WHERE customer_id = " + id);
    // 3b Add a if condition
  	if (rset.next ())
	  {
      customer = new Customer();
      customer.setId(id);
	    customer.setName(rset.getString(1));  //holds first column
      customer.setAddress(rset.getString(2));  //holds second column
//      customer.setPhone(rset.getString(3));  //holds third column
 //	    System.out.println("Customer found: " + customer);  // prints all three columns
    }
    // 3c add else statemnt and clean up
    else
    {
      throw new NotFoundException("Customer  with id " + id + " not found");
    }
	  rset.close();
    stmt.close();
    return customer;
  }
}
