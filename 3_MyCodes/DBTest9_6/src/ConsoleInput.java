import java.util.Scanner;

/**
 * Created by User PC on 6/9/16.
 */
public class ConsoleInput  {
    public static void main(String[] args)
    {
        System.out.println("Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //System.out.print(name);
        ServiceClass serviceClass = new ServiceClass();
        serviceClass.InsetDB(name);

    }
}
