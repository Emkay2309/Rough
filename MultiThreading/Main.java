package MultiThreading;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Even a = new Even();
        Odd b = new Odd();

        a.start();
        b.start();

    }
}

class Even extends Thread {
    @Override
     public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            }
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
            }
        }
    }
}

class Odd extends Thread {
    @Override
     public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            }

            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
            }

        }
    }
}

