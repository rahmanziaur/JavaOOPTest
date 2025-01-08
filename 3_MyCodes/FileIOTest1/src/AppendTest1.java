import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Monir on 10/2/16.
 */
public class AppendTest1 {

    public static void main(String[] args)
    {
        try(FileWriter fw = new FileWriter("files/appendTest.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("Badrul Alam");
            //more code
            out.println("Ahsan Habib");
            //more code
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
}
