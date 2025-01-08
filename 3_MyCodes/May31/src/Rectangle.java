/**
 * Created by User PC on 5/31/16.
 */
public class Rectangle {
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double width;
    private double height;

    public double getAreaOfRectangle()
    {
        return width*height;
    }
}
