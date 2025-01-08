/**
 * Created by User on 3/17/15.
 */
public class TwoThreadsMain {

    public static void main(String[] arg)
    {
        new TwoThreadsRunnable();

        for (int j=5; j>=1;j--)
        {
            System.out.print(Thread.currentThread() + ":" + j+"\n");
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
