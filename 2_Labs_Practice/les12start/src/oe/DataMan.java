package oe;

public class DataMan
{
  private static Customer[] customers = null;

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
  
  static 
  {
    buildCustomers();
  }
}
