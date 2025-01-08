package oe;

public abstract class Product 
{
  private static int nextProductId = 2000;
  private int id;
  private String name;
  private String description;
  private double retailPrice;

  public Product()
  {
    id = nextProductId++;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int newId)
  {
    id = newId;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String newName)
  {
    name = newName;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String newDescription)
  {
    description = newDescription;
  }

  public double getRetailPrice()
  {
    return retailPrice;
  }

  public void setRetailPrice(double newRetailPrice)
  {
    retailPrice = newRetailPrice;
  }

  public String toString()
  {
    return "[" + Util.getClassName(this) + "] " + id + " " + name + " " + Util.toMoney(retailPrice);
  }
}