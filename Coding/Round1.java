package Coding;

public class Round1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getState());

        try {
            for(int i=0 ; i<4 ; i++) {
                System.out.println(i);
                t.sleep(1000);
            }
        }
        catch(InterruptedException ex) {
            System.out.println(t.getName() + "Intereputed");
            System.out.println("Hello");
        }
    }
}
