/**
 * Created by Monir on 9/30/16.
 */
 abstract class B {

    public final int b =10;

    public void get()
    {
        System.out.print("This get");
    }

    public B()
    {

    }
    public B(int a){
        System.out.print("This is B");

    }
}

public class AbsClass extends B
{
    public static void main(String[] args)
    {
        B bc = new B(10) {
           // @Override
            public void get() {
                super.get();
            }
        };
        System.out.print("The value of b:"+bc.b);

    }

}
