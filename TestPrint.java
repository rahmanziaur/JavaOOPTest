import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

class MyPrintStream {

    private FileOutputStream out;

    public MyPrintStream() {
        out = new FileOutputStream(FileDescriptor.out);
    }

    public void myPrint(String message) {
        try {
            out.write(message.getBytes());
            out.write('\n');
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class TestPrint {

    public static void main(String[] args) {

        MyPrintStream ict = new MyPrintStream();

        ict.myPrint("Assalamualykum! ICT 21th Batch");
    }
}