package LifeCycle;

class PrintNumber extends Thread {

    public PrintNumber() {

    }
    public PrintNumber(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority()+ ":" + i);
            }

//            if (i % 20 ==0){
//                Thread.yield();
//            }
        }
    }
}
public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber("线程1");
        p.setPriority(Thread.MIN_PRIORITY);
        p.start();

        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority()+ ":" + i);
            }
//            if (i == 20) {
//                try {
//                    p.join();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
        }
//        System.out.println(p.isAlive());
    }
}

