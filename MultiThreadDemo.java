import java.util.Random;

class NumberGenerator extends Thread {
    volatile int number;
    volatile boolean ready = false;

    public void run() {
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            number = rand.nextInt(20);
            ready = true;

            System.out.println("Generated Number : " + number);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class SquareThread extends Thread {
    NumberGenerator gen;

    SquareThread(NumberGenerator gen) {
        this.gen = gen;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1100);
            } catch (InterruptedException e) {
            }

            if (gen.ready && gen.number % 2 == 0) {
                System.out.println(
                    "Square of " + gen.number + " = "
                    + (gen.number * gen.number)
                );
            }
        }
    }
}

class CubeThread extends Thread {
    NumberGenerator gen;

    CubeThread(NumberGenerator gen) {
        this.gen = gen;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1100);
            } catch (InterruptedException e) {
            }

            if (gen.ready && gen.number % 2 != 0) {
                System.out.println(
                    "Cube of " + gen.number + " = "
                    + (gen.number * gen.number * gen.number)
                );
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        NumberGenerator gen = new NumberGenerator();

        SquareThread sq = new SquareThread(gen);
        CubeThread cb = new CubeThread(gen);

        gen.start();
        sq.start();
        cb.start();
    }
}