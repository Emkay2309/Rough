package MockPractice;

public class Work extends Thread{
    @Override
    public void run() {
        System.out.println("Work");
    }

    public static void main(String[] args) {
        Work work = new Work();
        work.start();
    }
}
