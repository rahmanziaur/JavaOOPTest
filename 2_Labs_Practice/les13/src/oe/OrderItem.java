package oe;

public class OrderItem 
{
  private int lineNbr;
  private int quantity;
  private double unitPrice;
  private Product product;
  
  public OrderItem(Product newProduct)
  {
    product = newProduct;
    unitPrice = product.getRetailPrice();
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

  public Product getProduct()
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

  public void setProduct(Product newProduct)
  {
    product = newProduct;
  }

  public double getTax()
  {
    double itemTax = 0.0;
    if (product instanceof Taxable)
    {
      itemTax =((Taxable) product).getTax(getItemTotal());
    }
    return itemTax;
  }
  
  public String toString()
  {
    String result = lineNbr + " product: " + product + " qty: " + quantity;
    if (product instanceof Taxable)
    {
      result += " tax: " + Util.toMoney(getTax());
    }
    result += " Item total: " + Util.toMoney(getItemTotal());
    return result;
  }

}