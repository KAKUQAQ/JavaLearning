package Synchronized.RannableSafe;

class SaleTicket implements Runnable {
    int  ticket = 100;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    try{
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        SaleTicket st = new SaleTicket();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        Thread t3 = new Thread(st);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
