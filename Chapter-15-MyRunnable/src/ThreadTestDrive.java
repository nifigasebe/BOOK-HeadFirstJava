/**
 * Created by alexeychizhov on 15.11.2014.
 */
public class ThreadTestDrive {
    public static void main(String[] args) {

        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        myThread.start();

        System.out.println("Main");
    }
}
