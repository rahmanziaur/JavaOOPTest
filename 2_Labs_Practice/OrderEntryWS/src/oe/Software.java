package oe;

public class Software extends Product 
{
  private String license = "30 Day Trial";

  public Software(String name, String desc, double price)
  {
    setName(name);
    setDescription(desc);
    setRetailPrice(price);
  }

  public String getLicense()
  {
    return license;
  }

  public void setLicense(String newLicense)
  {
    license = newLicense;
  }
}