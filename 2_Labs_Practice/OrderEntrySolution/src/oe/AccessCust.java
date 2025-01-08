package oe;

// 3 import statements
import java.sql.*;

//4 class to retrieve data
public class AccessCust 
{
  public static void main (String args [])
    throws Exception
  {
// 5 Register the Oracle JDBC driver
	DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
// 6 Connect to the database 
// (replace HOST_VALUE and SID by the appropriate values)
// ------------------------------------------------------
   String url = "jdbc:oracle:thin:@localhost:1521:orcl9i";
// (replace username and passowrd by the appropriate values)
// ------------------------------------------------------
	Connection conn =
		DriverManager.getConnection (url, "les17","oracle");
// 7 
	conn.setAutoCommit (false);
// 8 Create a Select Statement
	Statement stmt = conn.createStatement ();
	System.out.println("Table Customers query");
	ResultSet rset = stmt.executeQuery ("SELECT cust_last_name, nls_territory, phone_numbers FROM customers");
// 9 Add a loop
	while (rset.next ())
	{
	String a = rset.getString(1);  //holds first column
  String b = rset.getString(2);  //holds second column
  String c = rset.getString(3);  //holds third column
 	System.out.println(a + " " + b + " " + c);  // prints all three columns
//	System.out.println(rset.getInt(1));
//	System.out.println(rset.getString(2));
//	System.out.println(rset.getString(3));
	}
	rset.close();

  }
}