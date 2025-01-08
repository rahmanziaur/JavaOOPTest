package oe;

public class OrderItem 
{
  int lineNbr;
  int quantity;
  double unitPrice;

  public int getLineNbr() 
  {
    return lineNbr;
  }

  public int getQuantity() 
  {
    return quantity;
  }

  public double getUnitPrice()
  {
    return unitPrice;
  }

  public double getItemTotal()
  {
    return quantity * unitPrice;
  }

  public void setLineNbr(int newLineNbr)
  {
    lineNbr = newLineNbr;
  }

  public void setQuantity(int newQuantity)
  {
    quantity = newQuantity;
  }

  public void setUnitPrice(double newUnitPrice)
  {
    unitPrice = newUnitPrice;
  }
}