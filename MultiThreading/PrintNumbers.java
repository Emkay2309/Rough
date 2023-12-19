package MultiThreading;

public class PrintNumbers {
    public static  int number = 1;
    private static   int n = 20;
    private static  Object lock = new Object();

    public static void main(String[] args) {
        Thread evenThread = new Thread( () -> {
            while( number <= n) {
                synchronized (lock) {  //sync parent
                    if(number % 2 == 0) {
                        System.out.print(number + " ");
                        number++;
                        lock.notify();
                    }
                    else {
                        try{
                            lock.wait();  //for 1 it will wait
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
                    if(number % 2 != 0) {  // 1
                        System.out.print(number + " ");
                        number++;  //2
                        lock.notify();  //Wakes up even threads that is waiting on this object's monitor
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

