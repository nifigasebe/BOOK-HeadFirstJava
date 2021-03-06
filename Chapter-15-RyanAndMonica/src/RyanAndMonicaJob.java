/**
 * Created by alexeychizhov on 15.11.2014.
 */
public class RyanAndMonicaJob implements Runnable {

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {

        RyanAndMonicaJob theJob = new RyanAndMonicaJob();

        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    public void run(){

        for (int x=0; x<10; x++){
            makeWithdrawl(10);
            if (account.getBalance() < 0) {
                System.out.println("Привышение лимита!!!!!!!!!!!!!!!!!");
                System.out.println(account.getBalance());
            }
        }
    }

    private void makeWithdrawl(int amount){ //synchronized

        if (account.getBalance() >= amount){

            System.out.println(Thread.currentThread().getName() + " собирается снять деньги");

            try {
                System.out.println(Thread.currentThread().getName() + " идет подремать");
                Thread.sleep(500);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " просыпается");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " заканчивает транзакцию");
        }
        else {
            System.out.println("Извините, для клиента " + Thread.currentThread().getName() + " недостаточно денег");
        }
    }
}
