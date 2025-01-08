package oe;

public class Hardware extends Product implements Taxable
{
  private int warrantyPeriod = 6;

  public Hardware(String name, String desc, double price)
  {
    setName(name);
    setDescription(desc);
    setRetailPrice(price);
  }

  public int getWarrantyPeriod()
  {
    return warrantyPeriod;
  }

  public void setWarrantyPeriod(int newWarrantyPeriod)
  {
    warrantyPeriod = newWarrantyPeriod;
  }

  public double getTax(double amount)
  {
    return amount * TAX_RATE;
  }
}