package Runnable;

class EvenNumberRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }
    }
}
public class EvenNumberTest {
    public static void main(String[] args) {
        EvenNumberRunnable p = new EvenNumberRunnable();
        Thread t1 = new Thread(p);
        t1.start();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }

        Thread t2 = new Thread(p);
        t2.start();
    }
}
