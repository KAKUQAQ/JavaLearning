package communication;

class PrintNumber implements Runnable {
    private int number = 1;
    public void run() {

        while (true) {
            synchronized (this) {
                notify();
                if (number <= 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                } else {
                    break;
                }
            }
        }
    }
}

public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        Thread t1 = new Thread(p, "线程1");
        Thread t2 = new Thread(p,"线程2");
        t1.start();
        t2.start();
    }
}
