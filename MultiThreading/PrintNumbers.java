package MultiThreading;

public class PrintNumbers {
    public static  int number = 1;
    private static   int n = 20;
    private static  Object lock = new Object();

    public static void main(String[] args) {
        Thread evenThread = new Thread( () -> {
            while( number <= n) {
                synchronized (lock) {
                    if(number % 2 == 0) {
                        System.out.print(number + " ");
                        number++;
                        lock.notify();
                    }
                    else {
                        try{
                            lock.wait();
                        }
                        catch(Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread oddThread = new Thread( () -> {
            while(number <= n) {
                synchronized (lock) {
                    if(number % 2 != 0) {
                        System.out.print(number + " ");
                        number++;
                        lock.notify();
                    }
                    else {
                        try{
                            lock.wait();
                        }
                        catch(Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}
