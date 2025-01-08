/**
 * Created by Monir on 4/11/17.
 */
public class Geometry {

    protected double area;

    public Geometry() {
    }

    public Geometry(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(Geometry area) {
        this.area = area.getArea();
    }
}
