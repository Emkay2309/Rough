package LLD1;

public class SimpleRunnable implements  Runnable{
    @Override
    public void run() {
        try{
            Thread t = new Thread(new SimpleRunnable());
            t.start();
            Thread.sleep(1000);
            t.interrupt();
        }
        catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
