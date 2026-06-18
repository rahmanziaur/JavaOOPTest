package shapes;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read target shape type (rectangle or circle)
        if (!scanner.hasNext()) return;
        String shapeType = scanner.next().trim();

        // Common Shape properties
        String color = scanner.next();
        boolean filled = scanner.nextBoolean();

        if (shapeType.equalsIgnoreCase("rectangle")) {
            double width = scanner.nextDouble();
            double length = scanner.nextDouble();

            Rectangle rect = new Rectangle(color, filled, width, length);

            // Output details rounded strictly or formatted uniformly
            System.out.println(rect.toString());
            //System.out.printf("Area: %.2f\n", rect.getArea());
           // System.out.printf("Perimeter: %.2f\n", rect.getPerimeter());

        } else if (shapeType.equalsIgnoreCase("circle")) {
            double radius = scanner.nextDouble();

            Circle circle = new Circle(color, filled, radius);

            System.out.println(circle.toString());
            //System.out.printf("Area: %.2f\n", circle.getArea());
            //System.out.printf("Perimeter: %.2f\n", circle.getPerimeter());
        }

        scanner.close();
    }
}