/**
 * Created by alexeychizhov on 15.11.2014.
 */
public class MyRunnable implements Runnable {
    public void run(){
        go();
    }
    public void go(){
        doMore();
    }
    public void doMore(){
        System.out.println("Второй поток");
    }
}
