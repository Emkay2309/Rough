package Java8.Threads;

public class Main {
    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am in T1 thread");
            }
        };
        t1.run();
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am in T2 thread");
            }
        };
        t2.run();


    }
}
