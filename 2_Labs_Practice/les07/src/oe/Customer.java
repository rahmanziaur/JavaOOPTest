package oe;

public class Customer 
{
  private int id;
  private String name;
  private String address;
  private String phone;

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
    return id + " " + name + " " + address + " " + phone;
  }
}