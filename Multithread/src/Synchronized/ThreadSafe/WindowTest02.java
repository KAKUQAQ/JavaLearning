package Synchronized.ThreadSafe;

class Window1 extends Thread {
    static int ticket = 100;
    static boolean flag = true;
    @Override
    public void run() {
        while (flag) {
            show();
        }
    }

    public void show(){
        synchronized (Window1.class) {
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
}

public class WindowTest02 {
    public static void main(String[] args) {
        Window1 w1 = new Window1();
        Window1 w2 = new Window1();
        Window1 w3 = new Window1();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
