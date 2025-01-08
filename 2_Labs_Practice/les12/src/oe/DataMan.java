package oe;

// 2a
import java.util.HashMap;

public class DataMan
{
// 2a
  private static class ProductMap extends HashMap
  {
  // 2b
    public void add(Product p)
    {
      String key = Integer.toString(p.getId());
      put(key, p);
    }
  }
  
  private static Customer[] customers = null;
  // 2d
  private static ProductMap products = null;
  
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

// 3a
  public static void buildProducts()
  {
    if (products != null) return;
    products = new ProductMap();
    // 3c
    products.add(new Hardware("SDRAM - 128 MB", null, 299.0));
    products.add(new Hardware("GP 800x600", null, 48.0));
    products.add(new Software("Spreadsheet-SSP/V2.0", null, 45.0));
    products.add(new Software("Word Processing-SWP/V4.5", null, 65.0));
    products.add(new Manual("Manual-Vision OS/2x +", null, 125.0));    
  }
  
  public static Customer findCustomerById(int custId)
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
    return c;
  }

// 3f
  public static Product findProductById(int id)
  {
    String key = Integer.toString(id);
    return (Product) products.get(key);
  }
  
  static 
  {
    buildCustomers();
    // 3e
    buildProducts();
  }
}
