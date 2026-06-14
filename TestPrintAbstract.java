abstract class Printer {
    public abstract void myPrint(String message);
}

class NAMEPrintStream extends Printer {

    @Override
    public void myPrint(String message) {
        try {
            var output = new java.io.FileOutputStream(
                    java.io.FileDescriptor.out);

            output.write((message + "\n").getBytes());
            output.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class TestPrintAbstract {

    public static void main(String[] args) {

        Printer ict = new NAMEPrintStream();

        ict.myPrint("Assalamualykum! ICT 21th Batch -Printed using abstract class");
    }
}