package Multithread;


/*
        * What are Threads?
      *--> Threads are light weight subprocess that run within a process.
      *  It allows concurrent execution of code , enabling multiple operations to happen simultaneously .
      * Thread shares the same memory space , so they can access the same variable and objects.
      *
      *
      *
      * What is static keyword ?
      * ---> It is used to indicate that a variable or method belongs to a class and not to a instance of the class.
      *      This means that variable and method of the class is shared among all instance of the class .
      *      And it can be used without creating an instance of the object.

      *
      *
      * Volatile Keyword in Java ?
               Volatile keyword is used to modify the value of a variable by different threads.
            *  It is also used to make classes thread safe.
            *  It means that multiple threads can use a method and instance of the classes at the same time without any problem.
            *  The volatile keyword can be used either with primitive type or objects.
            *
            *
            *
       * Synchronization in Java  ?
                Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
                Java Synchronization is better option where we want to allow only one thread to access the shared resource.

                Why use Synchronization?
                The synchronization is mainly used to

                To prevent thread interference.
                To prevent consistency problem.
* */
public class MainThread {
    public static void main(String[] args) {
        Thread t1 = new MyThread();

        Thread t2 = new Thread(new MyRunnableThread());

        Runnable t3 = ()-> {
            System.out.println("Printing from t3");
        };
        t3.run();

        t2.start();

        System.out.println(MyStaticClass.val);

    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Running in MyThread");
    }
}

class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Running in MyRunnable Thread");
    }
}


class MyStaticClass {
    static int val = 10;
    static  void print() {
        System.out.println("This is static method");
    }

    static {
        System.out.println("This is a static block");
    }

}