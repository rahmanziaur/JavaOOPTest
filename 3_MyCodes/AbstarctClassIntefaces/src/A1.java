/**
 * Created by Monir on 9/30/16.
 */
 interface Habib {

    void show();


}

class A1 implements Habib
{

    public static void main(String[] args)
    {
        System.out.println("This is an Abstarct class's main Method");
        Habib hb = new A1() ;
        hb.show();
    }


    public void show() {
        System.out.print("This Overide Show");

    }
}
