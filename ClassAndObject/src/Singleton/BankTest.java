package Singleton;

public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1.equals(bank2));
    }
}

// 饿汉式
class Bank {
    private Bank(){

    }
    // 在类内部创建当前实例，此属性也必须声明为Static
    private static Bank instance = new Bank();


    //使用getXxx()方法获取当前类的实例，必须声明为Static
    public static Bank getInstance() {
        return instance;
    }
}
