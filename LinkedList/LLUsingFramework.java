package LinkedList;
import java.util.LinkedList;

public class LLUsingFramework {
    public static void main(String[] args) {

        //create
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
    }
}
