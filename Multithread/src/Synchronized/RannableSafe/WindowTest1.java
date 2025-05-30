package Synchronized.RannableSafe;

class SaleTicket1 implements Runnable {
    int  ticket = 100;
    boolean flag = true;
    @Override
    public void run() {
        while (flag) {
            show();
        }
    }
    public synchronized void show(){
        if (ticket > 0) {
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "票号为：" + ticket);
            ticket--;
        }else {
            flag = false;
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        SaleTicket1 st = new SaleTicket1();
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
