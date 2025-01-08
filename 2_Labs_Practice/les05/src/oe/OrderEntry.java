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
    // --------------------------------------------
    // Question 5.1
    //---------------------------------------------

    // Declare and initialize vars to hold a date
    int day =10, mth = 2, yr = 2000;

    // Display the date
    System.out.println(day + "/" + mth + "/" + yr);

    // Determine number of days in that month
    int daysInMonth;
    switch (mth) {
      case 4:
      case 6:
      case 9:
      case 11: daysInMonth = 30;
               break;
      case 2:  daysInMonth = 28;
               break;
      default: daysInMonth = 31;
               break;
    }
    System.out.println(daysInMonth + " days in month");


    // --------------------------------------------
    // Question 5.3 using a for loop
    //---------------------------------------------

   // Print all days to the end of the month, using a for loop
    System.out.println("Printing all days to end of month using for loop...");
    for (int temp1 = day;
         temp1 <= daysInMonth;
         temp1++) {
      System.out.println(temp1 + "/" + mth + "/" + yr);
    }
    // --------------------------------------------
    // Question 5.2.c using a for loop
    //---------------------------------------------

    // Print maximum of 10 dates, using a for loop
    System.out.println("Printing maximum of 10 days using for loop...");
    for (int temp3 = day, iter = 0;
         temp3 <= daysInMonth && iter < 10;
         temp3++, iter++) {
      System.out.println(temp3 + "/" + mth + "/" + yr);
    }

    // --------------------------------------------
    // Question 5.3
    //---------------------------------------------
    day =27;               // set the test date
    mth = 2;
    yr = 2001;
    int rentDays = 3;    // the rental period in days


    // Determine leap year status first
    boolean isLeapYear = (yr % 4 == 0) &&       // year divisible by 4?  AND
              (  (yr % 100 != 0) ||             // year not divisible by 100 OR
                 (yr % 400 == 0)  );            // year divisible by 400

    // Use leap year status for February calculation
    switch (mth) {
      case 4:
      case 6:
      case 9:
      case 11: daysInMonth = 30;
               break;
      case 2:  daysInMonth = ( (isLeapYear) ? 29 : 28);
               break;
      default: daysInMonth = 31;
               break;
    }



    // --------------------------------------------
    // Question 5.4 and 5.5
    //---------------------------------------------

    

    int dueDay, dueMth, dueYr;       // rental due date variables
    dueMth = mth;                    // initialize to the test date
    dueYr = yr;
    dueDay = rentDays + day;         // add the rental number of days to day
                                     // to get the dueDay

    if (dueDay <= daysInMonth)       // is dueDay valid for the current month?
      System.out.println(dueDay + "/" + dueMth + "/" + dueYr);
    else {
      dueDay = (dueDay - daysInMonth); // set dueDay to a day in the next month
      dueMth = (dueMth + 1);           // increment the month
      if (dueMth > 12) {               // is the new month in a new year
        dueMth = 1;
        dueYr += 1;
      }
      System.out.println("Rental Date:           " + day + "/"
                          + mth + "/" + yr);
      System.out.println("Number of rental days: " + rentDays);
      System.out.println("Date Due back:         " + dueDay + "/"
                          + dueMth + "/" + dueYr);
    }


      // --------------------------------------------
      // Question 5.5
      // --------------------------------------------

    // Print all days to the end of the month, using a while loop
    int temp2 = day;     // initialize temp to day of the month
    System.out.println("Printing all days to end of month using while loop...");
    while (temp2 <= daysInMonth) {
      System.out.println(temp2 + "/" + mth + "/" + yr);
      temp2++;
    }
      // --------------------------------------------
      // Question 5.5
      // --------------------------------------------
    // Print maximum of 10 dates, using a while loop
    System.out.println("Printing maximum of 10 days using while loop...");
    int temp4 = day;    // initialize temp2 to day of the month
    int numSoFar = 0;
    while (temp4 <= daysInMonth) {
      System.out.println(temp4 + "/" + mth + "/" + yr);
      temp4++;
      if (++numSoFar == 10)  // additional counter to see how many
        break;               // days we printed, break after 10
    }
      // --------------------------------------------
      // Question 5.6
      // --------------------------------------------
      // Determine invalid months
    if ((mth > 0 )& (mth <13))
      System.out.println (mth + " is a valid month");
    else
      System.out.println (mth + " is not a valid month");

  }
}