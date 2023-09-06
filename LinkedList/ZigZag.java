package LinkedList;

public class ZigZag {
    public static void main(String[] args) {

        Nodes<Integer> head = new Nodes<Integer>(1);
        Nodes<Integer> a = new Nodes<Integer>(2);
        Nodes<Integer> b = new Nodes<Integer>(3);
        Nodes<Integer> c = new Nodes<Integer>(4);
        Nodes<Integer> d = new Nodes<Integer>(5);
        Nodes<Integer> e = new Nodes<Integer>(6);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        printNodes(head);
        ChangeZigZag(head);
        printNodes(head);

    }

    public static void printNodes(Nodes<Integer> head) {
        Nodes<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.val +"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void ChangeZigZag(Nodes<Integer> head) {
        // step 1 : find mid for creating 2 lists
        Nodes<Integer> slow = head;
        Nodes<Integer> fast = head.next;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Nodes<Integer> mid = slow;

        //step 2 : Reversing the 2nd list
        Nodes<Integer> curr = mid.next;
        Nodes<Integer> prev = null;
        Nodes<Integer> next ;

        mid.next = null; //updating the 1st list last node to null

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step 3 : connecting the 1st and 2nd list in zigzag
        Nodes<Integer> left = head;
        Nodes<Integer> right = prev;
        Nodes<Integer> nextL ;
        Nodes<Integer> nextR ;

        while (left!= null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }
}
