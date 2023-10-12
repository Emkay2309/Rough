package MultiThreading;

public class ThreadCreation {
    public static void main(String[] args) {    // Thread
        System.out.println("Main Thread is starting");

        Thread thread1 = new Thread1("Thread A : ");
        thread1.start();

        Thread thread2 = new Thread(new Thread2());
        thread2.start();

        System.out.println("Main is Thread is exiting");
    }

    // 1.  class   --> object direct create .....  new ClassName();
    // 2. Interface  --> pass object  in constructor which will be used by the method in interface
}
