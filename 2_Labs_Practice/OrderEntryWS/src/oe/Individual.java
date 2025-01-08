package oe;

public class Individual extends Customer 
{
  private String licNumber;

  public Individual(String aName, String aAddress, String aPhone, String aLicNumber)
  {
    super(aName, aAddress, aPhone);
    licNumber = aLicNumber;
  }

  public String getLicNumber()
  {
    return licNumber;
  }

  public void setLicNumber(String newLicNumber)
  {
    licNumber = newLicNumber;
  }

  public String toString()
  {
    return super.toString() + " (" + licNumber + ")";
  }
}