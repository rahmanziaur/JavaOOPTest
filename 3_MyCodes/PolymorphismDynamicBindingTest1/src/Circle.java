/**
 * Created by Monir on 9/1/16.
 */
public class Circle extends Geometry {

    private double radius;

    public Circle()
    {

    }

    public Circle(double radius)
    {
            this.radius = radius;
    }

    public Circle(double radius, boolean filled)
    {
        super(filled);
        this.radius = radius;

    }

    public double getArea(double j)
    {
        System.out.println("This is the area of Circle");
        return Math.PI * radius * radius;
    }

}
