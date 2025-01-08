package oe;

public class OrderEntry 
{
  public static void main(String[] args)
  {    // Declare and initialize two variables
    double item1;        // Declare one variable
    double item2;        // Declare another variable

    item1 = 2.95;         // Assign value to item1
    item2 = 3.50;         // Assign value to item2

    // These 4 statements could be combined into a single
    // statement as follows:
    //   float item1 = 2.95, item2 = 3.50;


    int line = 1, numOfDays = 2;    // other variables used
                                    // throughout the program
    boolean tooExpensive;
    double itemTotal, total, taxRate = 1.0825;



    // Display the cost of the two items
    System.out.println(item1);
    System.out.println(item2);

    // Display more meaningful messages
    System.out.println(
      "Item " + line++ +" is " + item1 + " * " + numOfDays + " days = "
              +(item1 * numOfDays));
    System.out.println(
      "Item " + line++ +" is " + item2 + " * " + numOfDays + " days = "
              +(item2 * numOfDays));

    System.out.println("Order Entry Application");

    // Calculate and display the total of the items
    itemTotal = ((item1 * numOfDays) + (item2 * numOfDays));
    System.out.println("Item Total: " + itemTotal);

  }
}