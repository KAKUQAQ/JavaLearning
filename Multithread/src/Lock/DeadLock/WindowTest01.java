package Lock.DeadLock;

import java.util.concurrent.locks.ReentrantLock;

class Window extends Thread {
    static int ticket = 100;
    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}

public class WindowTest01 {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
