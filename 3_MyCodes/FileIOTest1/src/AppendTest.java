import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Monir on 10/2/16.
 */
public class AppendTest {

    public static void main(String[] args)
    {
        try {
            Files.write(Paths.get("files/myfile.txt"), "\nthis ict 22".getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            //exception handling left as an exercise for the reader
            e.printStackTrace();
        }
    }
}
