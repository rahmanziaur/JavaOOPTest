/**
 * Created by Monir on 8/21/16.
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

    public Circle(double radius, String color,boolean filled )
    {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return Math.PI * radius *radius;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public void printCircle()
    {
        System.out.println("The Radius:"+getRadius()+"\nThe Area is:"+getArea()+"\nThe perimeter is:"+getPerimeter()+"\nThe Diameter is:"+getDiameter());
    }
}
