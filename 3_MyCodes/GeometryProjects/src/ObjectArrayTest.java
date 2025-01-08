/**
 * Created by Monir on 8/23/16.
 */
public class ObjectArrayTest {

    public static void Calculation(Circle[] circle)
    {
        for (int i=0; i<circle.length; i++)
        {
            System.out.println("\nCircle Number["+(i+1)+"]:"+circle[i]);
            circle[i].printCircle();
        }
    }

    public static void CalcRect(Rectangle[] rect)
    {
        for (int i=0; i<rect.length; i++)
        {
        System.out.println("\nRectangle Number["+(i+1)+"]:"+rect[i]);
            rect[i].printRect();
        }
    }

    public static void main(String[] args)
    {
       myReturn();
        System.out.println("\n");
        myReturn1();


    }

    public static Circle[] myReturn()
    {
        Circle circle[] = {new Circle(2,"Red",true), new Circle(5,"Green",false),new Circle(10,"Blue",true), new Circle(20,"Yellow",true), new Circle(15,"Orange",true) };
        Calculation(circle);
        return circle;
    }

    public static Rectangle[] myReturn1()
    {
        Rectangle[] rectangles = {new Rectangle("Red",true, 10,12),new Rectangle("Orange",false,20,25),new Rectangle("Pink",true,30,40),new Rectangle("White",true,50,60),new Rectangle("Magenta",true, 20,100)};
        CalcRect(rectangles);
        return rectangles;

    }
}
