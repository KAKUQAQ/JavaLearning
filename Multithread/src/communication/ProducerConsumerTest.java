package communication;

class Clerk {
    private int productNumber = 0;

    public synchronized void addProduct() {
        if (productNumber >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            productNumber++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + productNumber + "个产品");
            notify();
        }

    }
    public synchronized void minusProduct() {
        if (productNumber <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println(Thread.currentThread().getName() + "消费了第" + productNumber + "个产品");
            productNumber--;
            notify();
        }

    }
}

class Producer extends Thread {

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }
    public void run() {

        while (true) {
            System.out.println("Producer is running");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.addProduct();

        }
    }
}

class Consumer extends Thread {
    private Clerk clerk;
    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }
    public void run() {
        while (true) {
            System.out.println("Consumer is running");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.minusProduct();
        }
    }

}
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);
        producer.setName("生产者");
        consumer.setName("消费者");
        producer.start();
        consumer.start();
    }
}
