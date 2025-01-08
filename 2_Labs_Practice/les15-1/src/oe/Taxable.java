package oe;

public interface Taxable 
{
  double TAX_RATE = 0.10;
  double getTax(double amount);
}