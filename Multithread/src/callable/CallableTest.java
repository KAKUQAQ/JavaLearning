package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class NumThread implements Callable {
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class CallableTest {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);
        Thread t1 = new Thread(futureTask);
        t1.start();

        try{
            Object sum = futureTask.get();
            System.out.println(sum);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
