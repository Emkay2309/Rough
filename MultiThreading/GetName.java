package MultiThreading;

public class GetName {
    public static void main(String[] args) {
        System.out.println("Hello");

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Start");
        System.out.println(Thread.currentThread().getName());

    }
}
