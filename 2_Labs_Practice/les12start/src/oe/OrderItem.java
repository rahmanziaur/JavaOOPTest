package oe;

public class OrderItem 
{
  private int lineNbr;
  private int quantity;
  private double unitPrice;
  private int product;
  
  public OrderItem(int productId, double itemPrice)
  {
    product = productId;
    unitPrice = itemPrice;
    quantity = 1;
  }
  
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

  public int getProduct()
  {
    return product;
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

  public void setProduct(int newProduct)
  {
    product = newProduct;
  }
  
  public String toString()
  {
    return lineNbr + " product: " + product + " qty: " + quantity + " " + Util.toMoney(unitPrice);
  }

}