package threads;

public class BankAccount {
    private int balance = 100;

    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
}

class RyanAndMonicaJob implements Runnable{
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

    public void run() {
        for (int x = 0; x < 10; x++){
           makeWithdrawal(10);
           if (account.getBalance() < 0){
               System.out.println("Exceeding the limit");
           }
        }
    }

    private void makeWithdrawal(int amount){
        if (account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " going to withdraw money");
            try{
                System.out.println(Thread.currentThread().getName() + " going to take a nap");
                Thread.sleep(500);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " wakes up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " ends the transaction");
        } else {
            System.out.println("Sorry, not enough money for the client " + Thread.currentThread().getName());
        }
    }
}
