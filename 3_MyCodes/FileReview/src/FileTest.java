//import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by User on 3/16/15.
 */
public class FileTest {

    public void WriteIntoFile(File file)
    {


        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        double gpa;

        System.out.print("ID:");
        id = scanner.next();

        System.out.print("Name:");
        name = scanner.next();

        System.out.print("CGPA:");
        gpa = scanner.nextDouble();

        try
        {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(id+" ");
            fileWriter.write(name+" ");
            fileWriter.write(gpa+"\n");

            fileWriter.close();

            // Desktop.getDesktop().open(file);

        }
        catch (IOException iex)
        {
            iex.printStackTrace();
        }
        //System.out.println("Salam!");
    }

    public void ReadFromFile(File file)throws IOException
    {
        String id, name, cgpa;
        Scanner scanner = new Scanner(file);

        Scanner scanner1 = new Scanner(System.in);
        String searchIteam;
        System.out.println("Student ID you want to search:");
        searchIteam = scanner1.next();

        while (scanner.hasNext())
        {
         id = scanner.next();
         name = scanner.next();
         cgpa = scanner.next();
            System.out.print("Student ID:"+id+" "+"Name:"+name+" "+"CGPA:"+cgpa+"\n");
//            if(id.equals(searchIteam))
//            {
//            System.out.print("Student ID:"+id+" "+"Name:"+name+" "+"CGPA:"+cgpa+"\n");
//            }
        }
    }


    public static void main (String[] arg)throws IOException
    {
        File file = new File("test.txt");
       FileTest fileTest=new FileTest();
        //fileTest.WriteIntoFile(file);
        fileTest.ReadFromFile(file);
    }
}
