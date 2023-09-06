package Queues;
import java.util.*;
public class Dq {
    public static void main(String[] args) {
        Deque <Integer> dqu = new LinkedList<>();

        dqu.addFirst(1);
        dqu.addFirst(2);
        dqu.addLast(3);
        dqu.addLast(4);
        System.out.println(dqu);
        dqu.removeFirst();
        dqu.removeLast();
        System.out.println(dqu);

    }
}
