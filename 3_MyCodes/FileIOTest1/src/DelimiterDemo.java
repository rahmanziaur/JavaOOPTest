import java.awt.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Monir on 10/2/16.
 */
public class DelimiterDemo {

    public static void main(String[] args) {

        //String s = "Hello World! 3 + 3.0 = 6.0 true ";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(System.in);
        File file = new File("files/delimiter.txt");

        try(FileWriter fw = new FileWriter(file, true);BufferedWriter bw = new BufferedWriter(fw);PrintWriter out = new PrintWriter(bw))
        {
            //System.out.println("" + scanner.nextLine());

            System.out.print("Enter Data to write into the file:");
            out.print(scanner.nextLine());

            // change the delimiter of this scanner
            scanner.useDelimiter(" &&");

            // display the new delimiter
            //System.out.println("" + scanner.delimiter());
            out.println(scanner.delimiter());

            // close the scanner
            scanner.close();



            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().edit(file);
            } else {
                // dunno, up to you to handle this
            }

            Scanner sc = new Scanner(file);

            while (sc.hasNext())
            {
                String fn = sc.next();
                String ln = sc.next();
                String dl = sc.next();
                if(fn.equalsIgnoreCase("Ziaur"))
                System.out.println(fn+" "+ln+" "+dl);
            }



        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
