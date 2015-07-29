/**
 * Created by Alexey on 19.11.2014.
 */
public class ThreadTwo implements Runnable {
    Accum a = Accum.getAccum();

    public void run(){

        for (int x=0; x<99; x++){
            a.updateCounter(1);

             try {
                Thread.sleep(50);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        System.out.println("два "+ a.getCount());
    }
}