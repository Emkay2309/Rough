package LinkedList;

public class DoublyLL {
    public static void main(String[] args) {
        LLNode head = new LLNode(1);
        LLNode a = new LLNode(2);
        LLNode b = new LLNode(3);
        LLNode c = new LLNode(4);
        LLNode d = new LLNode(5);
        LLNode e = new LLNode(6);
        LLNode tail = e;

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        tail.next = null;

        head.prev = null;
        a.prev = head;
        b.prev = a;
        c.prev = b;
        d.prev = c;
        tail.prev = d;

        printNodes(head);
        LLNode ans = addFirst(head);
        printNodes(ans);
        addLast(tail);
        printNodes(ans);
//        reverseDoublyLL(ans);

    }

    public static void printNodes(LLNode head) {
        LLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data +"<==>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static LLNode addFirst(LLNode head) {
        LLNode newNode = new LLNode(0);

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }
    public static void addLast(LLNode tail) {
        LLNode newNode = new LLNode(7);

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        return ;
    }
//    public static LLNode reverseDoublyLL(Node head, Node tail) {
//        LLNode curr = head;
//        LLNode prev = null;
//        LLNode next;
//
//        while(curr!=null) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        return prev;
//    }
}
class LLNode {
    int data;
    LLNode next;
    LLNode prev;

    public LLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public static LLNode head;
    public static LLNode tail;
    public static int size;

}


