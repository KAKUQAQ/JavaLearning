package Lock;

public class BankTest {

    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                b1 = Bank.getInstance();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                b2 = Bank.getInstance();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.equals(b2));
    }
}

// 饿汉式
class Bank {
    private Bank(){

    }
    // 在类内部创建当前实例，此属性也必须声明为Static
    private static Bank instance = new Bank();


    //线程安全方式1
//    public static synchronized Bank getInstance() {
//        if(instance == null){
//
//            try{Thread.sleep(1000);}
//            catch(InterruptedException e){
//                e.printStackTrace();
//            }
//
//            instance = new Bank();
//        }
//        return instance;
//    }
    // 线程安全方式2
//    public static Bank getInstance() {
//        synchronized (Bank.class) {
//            if (instance == null) {
//
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                instance = new Bank();
//            }
//        }
//        return instance;
//    }

    // 线程安全方式3
    public static Bank getInstance() {
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
