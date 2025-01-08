package oe;

public class Customer 
{
  private static int nextCustomerId = 0;
  private int id;
  private String name;
  private String address;
  private String phone;

  public Customer()
  {
    nextCustomerId++;
    setId(nextCustomerId);
  }

  public Customer(String theName, String theAddress, String thePhone)
  {
    this();
    name = theName;
    address = theAddress;
    phone = thePhone;
  }

  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }

  public String getPhone()
  {
    return phone;
  }

  public void setId(int newId)
  {
    id = newId;
  }

  public void setName(String newName)
  {
    name = newName;
  }

  public void setAddress(String newAddress)
  {
    address = newAddress;
  }

  public void setPhone(String newPhone)
  {
    phone = newPhone;
  }

  public String toString()
  {
    return "[" + Util.getClassName(this) + "] " + id + " " + name + " " + address + " " + phone;
  }
}