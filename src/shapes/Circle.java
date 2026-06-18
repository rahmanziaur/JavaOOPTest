package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "[ Circle ]\n" +
                super.toString() + "\n" +
                "Radius: " + radius + "\n" +
                String.format("Area         : %.2f", getArea())      + "\n" +
                String.format("Circumference: %.2f", getPerimeter());
    }

    public double getRadius() { return radius; }
}