import java.util.Date;

/**
 * Created by Monir on 8/21/16.
 */
public class Rectangle extends Geometry {

    private double width, length;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double length, double width) {

        this(length,width);
        setColor(color);
        setFilled(filled);

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double areaOfRect()
    {
        return width * length;
    }

    public double getPerimeterOfRect()
    {
        return 2 * (length+width);
    }

    public void printRect()
    {
        System.out.println("The Length is:"+getLength()+"\nThe Width is:"+getWidth()+"\n The ARea is:"+areaOfRect()+"\nThe perimeter is:"+getPerimeterOfRect());
    }
}
