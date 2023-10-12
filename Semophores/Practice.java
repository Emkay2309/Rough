package Semophores;
import java.util.concurrent.Semaphore;

public class Practice {
    public static void main(String[] args) {
        H2O a = new H2O();
        String inputSequence = "HHHHHHOOOO";

        for (char atom : inputSequence.toCharArray()) {
            if (atom == 'H') {
                Thread t = new Thread(() -> {
                    try {
                        a.hydrogen(() -> System.out.print("H"));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                t.start();
            } else if (atom == 'O') {
                Thread t = new Thread(() -> {
                    try {
                        a.oxygen(() -> System.out.print("O"));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                t.start();
            }
        }
    }

    public static class H2O {
        Semaphore h, o;

        public H2O() {
            h = new Semaphore(3);
            o = new Semaphore(0);
        }

        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
            h.acquire();
            releaseHydrogen.run();
            o.release(3);
        }

        public void oxygen(Runnable releaseOxygen) throws InterruptedException {
            o.acquire(2);
            releaseOxygen.run();
            h.release(5);
        }
    }
}
