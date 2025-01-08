package oe;

import java.text.DecimalFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Util 
{
  public static boolean isLeapYear(int year)
  {
    return (year % 4 == 0) &&
           ((year% 100 != 0) || (year % 400 == 0));
  }

  public static int lastDayInMonth(int month, int year)
  {
    int daysInMonth = 0;

    switch (month)
    {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        daysInMonth = 31;
        break;
      case 2:
        daysInMonth = isLeapYear(year) ? 29 : 28;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        daysInMonth = 30;
        break;
    }
    return daysInMonth;
  }

  public static int getDaysToShip(char region)
  {
    int daysToShip = 1;
    switch (region)
    {
      case 'A':
        daysToShip = 3;
        break;
      case 'E':
        daysToShip = 5;
        break;
      case 'P':
        daysToShip = 7;
        break;
    }
    return daysToShip;
  }

  public static void main(String[] args)
  {
    int year = 1900;
    System.out.println("Year: " + year + " leap year? " + isLeapYear(year));
    year = 1964;
    System.out.println("Year: " + year + " leap year? " + isLeapYear(year));
    year = 1967;
    System.out.println("Year: " + year + " leap year? " + isLeapYear(year));
    year = 1984;
    System.out.println("Year: " + year + " leap year? " + isLeapYear(year));
    year = 1996;
    System.out.println("Year: " + year + " leap year? " + isLeapYear(year));
    year = 1997;
    System.out.println("Year: " + year + " leap year? " + isLeapYear(year));
    year = 2000;
    System.out.println("Year: " + year + " leap year? " + isLeapYear(year));
    year = 2001;
    System.out.println("Year: " + year + " leap year? " + isLeapYear(year));

    int day = 27;
    int month = 1;
    year = 2002;

    int daysInMonth = lastDayInMonth(month, year);
    System.out.println("Date is: " + day + "/" + month + "/" + year +
                       " (and has " + daysInMonth + " days in the month)");
    day = 20;
    month = 2;
    year = 2000;
    daysInMonth = lastDayInMonth(month, year);
    System.out.println("Date is: " + day + "/" + month + "/" + year +
                       " (and has " + daysInMonth + " days in the month)");
/*
**  Remove comments to test with month 13.
**
    month = 13;
    daysInMonth = lastDayInMonth(month, year);
    System.out.println("Date is: " + day + "/" + month + "/" + year +
                       " (and has " + daysInMonth + " days in the month)");
*/
    int daysToShip = getDaysToShip('A');
    System.out.println("It takes " + daysToShip + " days to ship to Americas");

    day = 27;
    month = 1;
    year = 2002;

    daysInMonth = lastDayInMonth(month, year);
/*
**  Solution to 4b.
    for (int aDay = day; aDay <= daysInMonth; aDay++)
    {
      System.out.println(aDay + "/" + month + "/" + year);
    }
*/
    day = 10; 
    month = 2;
/*
**  4e. with 'E' or 'P'
    daysToShip = getDaysToShip('E');
    daysToShip = getDaysToShip('P');
*/
    for (int aDay = day, j = 0; aDay <= daysInMonth && j < daysToShip; aDay++, j++)
    {
      System.out.println(aDay + "/" + month + "/" + year);
    }
  }

  public static String toMoney(double amount)
  {
    DecimalFormat df = new DecimalFormat("$##,###.00");
    return df.format(amount);
  }

  public static String toDateString(Date d)
  {
    SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-yyyy");
    return df.format(d);
  }

  public static Date getDate(int day, int month, int year)
  {
    GregorianCalendar gc = new GregorianCalendar(year, --month, day);
    return gc.getTime();
  }

  public static String getClassName(Object o)
  {
    String className = o.getClass().getName();
    return className.substring(className.lastIndexOf('.')+1, className.length());
  }
}