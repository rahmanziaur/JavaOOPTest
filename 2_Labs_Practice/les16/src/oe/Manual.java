package oe;

public class Manual extends Product 
{
  private String publisher = "Oradev Press";

  public Manual(String name, String desc, double price)
  {
    setName(name);
    setDescription(desc);
    setRetailPrice(price);
  }

  public String getPublisher()
  {
    return publisher;
  }

  public void setPublisher(String newPublisher)
  {
    publisher = newPublisher;
  }
}