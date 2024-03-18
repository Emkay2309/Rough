package MockPractice;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Thread t1 = new Thread(task1);
        t1.run();

        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Working on task2");
            }
        };
        t2.run();
    }
}
