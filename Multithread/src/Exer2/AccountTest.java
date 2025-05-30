package Exer2;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        Customer customer1 = new Customer(account,"甲");
        Customer customer2 = new Customer(account,"乙");

        customer1.start();
        customer2.start();
    }
}

class Account {
    private double balance;

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " deposit " + balance);
    }
}

class Customer extends Thread {
    Account account;

    public Customer(Account account) {
        this.account = account;
    }

    public Customer(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}