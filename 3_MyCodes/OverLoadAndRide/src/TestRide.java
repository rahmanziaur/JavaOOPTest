public class TestRide {
    public static void main(String[] args) {
        A1 a = new A1();
        a.p(10);
        a.p(10.0);
    }
}
class B1 {
    public void p(double i) {
        System.out.println(i * 2);
    }
}
class A1 extends B {
    // This method overrides the method in B
    public void p(double i) {
        System.out.println(i);
    }
}