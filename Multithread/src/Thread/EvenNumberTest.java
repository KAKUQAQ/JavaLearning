package Thread;

public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber();
        pn.start();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class PrintNumber extends Thread {
    public void run() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
