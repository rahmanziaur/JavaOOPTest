package oe;

public class Company extends Customer 
{
  private String contact;
  private int discount;

  public Company(String aName, String aAddress, String aPhone, String aContact, int aDiscount)
  {
    super(aName, aAddress, aPhone);
    contact = aContact;
    discount = aDiscount;
  }

  public String getContact()
  {
    return contact;
  }

  public void setContact(String newContact)
  {
    contact = newContact;
  }

  public int getDiscount()
  {
    return discount;
  }

  public void setDiscount(int newDiscount)
  {
    discount = newDiscount;
  }

  public String toString()
  {
    return super.toString() + " (" + contact + ", " + discount + "%)";
  }
}