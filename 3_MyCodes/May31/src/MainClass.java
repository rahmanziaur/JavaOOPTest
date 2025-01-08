import java.util.Scanner;

/**
 * Created by User PC on 5/31/16.
 */
public class MainClass {

    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Width: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        System.out.println("Enter the Height: ");
        double height = scanner.nextDouble();
        rectangle.setHeight(height);

        System.out.println("Area of Rectangle: "+rectangle.getAreaOfRectangle());

    }
}
