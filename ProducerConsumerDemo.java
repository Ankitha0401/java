import java.util.LinkedList;

class SharedBuffer {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 5;

    public synchronized void produce(int value)
            throws InterruptedException {

        while (list.size() == capacity) {
            wait();
        }

        list.add(value);
        System.out.println("Produced : " + value);
        notify();
    }

    public synchronized void consume()
            throws InterruptedException {

        while (list.isEmpty()) {
            wait();
        }

        int value = list.removeFirst();
        System.out.println("Consumed : " + value);
        notify();
    }
}

class Producer extends Thread {
    SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer extends Thread {
    SharedBuffer buffer;

    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.consume();
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}