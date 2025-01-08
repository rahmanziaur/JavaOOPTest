import java.util.ArrayList;

/**
 * Created by Monir on 8/21/16.
 */
public class ArrayListTest {

    public static void main(String[] args)
    {

        ArrayList<Circle> list = new ArrayList<Circle>();

        list.add(new Circle(2, "Orange", false));
        list.add(new Circle(3));
        list.add(new Circle(4, "Red", true));
        list.add(new Circle(5));
        list.add(new Circle(6, "White", true));

        //Geometry geometry = new Circle(2, "green",true);

        //geometry.toString();
        for (int i=0; i <list.size(); i++)
        {
            System.out.println("The Circle:"+(Circle)list.get(i)+"\tAnd it's area is:"+list.get(i).getArea());
        }

        //System.out.printf("The area of the circle %d : %.2f \n",(i+1),list.get(i).getArea());
    }
}
