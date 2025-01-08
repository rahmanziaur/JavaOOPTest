/**
 * Created by User on 3/17/15.
 */
public class TwoThreadsRunnable implements Runnable {
   private Thread thread;
    public TwoThreadsRunnable()
    {
        thread = new Thread(this,"Thread one");
        System.out.println("This is:"+thread);
        thread.setPriority(3);
        thread.start();

    }

    @Override
    public void run() {
        for(int i =0; i<5; i++)
        {
            System.out.print(thread + ":" + i + "\n");
            try {
                thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
