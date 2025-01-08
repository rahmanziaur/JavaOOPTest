package oe;

import java.util.HashMap;

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
  
  static 
  {
    buildCustomers();
    buildProducts();
  }
}
