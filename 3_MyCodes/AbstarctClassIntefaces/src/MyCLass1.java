/**
 * Created by Monir on 10/2/16.
 */
public class MyCLass1 implements ITest2 {
    @Override
    public void M() {
        System.out.print("Salam! This is overided Method");
    }

    public static void main(String[] args)
    {
       // System.out.print("This is an Interface");

        ITest2 iTest2 = new MyCLass1();
        iTest2.M();
        System.out.print("Value of x:"+ITest2.x);

    }
}
