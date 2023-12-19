package MultiThreading;

import java.util.HashMap;

public class Naming extends Thread {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();
        Naming Mohsin = new Naming();

        Mohsin.start();

        Naming emkay = new Naming();
        System.out.println(emkay.getPriority());
//        emkay.setName("emkay");
        emkay.setPriority(10);
        System.out.println(emkay.getPriority());
        emkay.start();

        Naming demon = new Naming();
        demon.setDaemon(true);
        demon.setPriority(5);
//        demon.setName("Demon");
        demon.start();

        System.out.println(Thread.currentThread().getName() +  " --> " + Thread.currentThread().getPriority() );
    }
    public void run() {
        System.out.println("Thread task Thread named : " + Thread.currentThread().getName() + "--> " + Thread.currentThread().getPriority() );
    }
}
