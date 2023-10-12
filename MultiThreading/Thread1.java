package MultiThreading;

public class Thread1 extends Thread {
    public Thread1(String name) {
        super(name);
    }
    @Override
    public void run() {
        for(int i=1 ; i<5 ; i++) {
            System.out.println("Thread1 : " + i);
        }
    }
}
