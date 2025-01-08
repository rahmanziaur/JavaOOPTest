/**
 * Created by User PC on 5/31/16.
 */
public class CommandLineTest {

    public static void main(String[] args)
    {
        String[] name= args;
        for (String s: name) {
            System.out.print(s);
            if (s.equals("#")) System.out.print("fff ");
        }
    }

}
