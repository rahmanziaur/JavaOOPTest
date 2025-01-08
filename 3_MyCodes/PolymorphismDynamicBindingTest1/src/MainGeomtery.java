/**
 * Created by Monir on 9/1/16.
 */
public class MainGeomtery {

    public static void main(String[ ]args)
    {
        Geometry ggd = new Geometry();
        System.out.println("This is called by GGD"+ggd.getArea(1));


        Geometry ggp1 = new Geometry(true);
        System.out.println("This is called by GGP1"+ggp1.getArea(1));

        Geometry gcd = new Circle();
        System.out.println("This is GCD"+gcd.getArea(1));

        Geometry gcdp1 = new Circle(10.50);
        System.out.println("This is GCP1"+gcdp1.getArea(1));

        Geometry gcdp2 = new Circle(15.50, false);
        System.out.println("This is GCDP2"+gcdp2.getArea(1));

        Circle ccd = new Circle();
        System.out.println("This is CCD"+ccd.getArea(10.50));

        Circle ccdp1 = new Circle(20.50);
        System.out.println("This is CCDP1"+ccdp1.getArea(10.50));

        Circle ccdp2 = new Circle(25.50, false);
        System.out.println("This is CCDP2"+ccdp2.getArea(10.50));

        //Circle cgd =(Circle) new Geometry();  //not Possible





    }
}
