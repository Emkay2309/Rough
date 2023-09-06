package LinkedList;

public class MergeSortLL {
    public static void main(String[] args) {
        Nodes<Integer> a = new Nodes<Integer>(1);
        Nodes<Integer> b = new Nodes<Integer>(2);
        Nodes<Integer> c = new Nodes<Integer>(3);
        Nodes<Integer> d = new Nodes<Integer>(4);
        Nodes<Integer> e = new Nodes<Integer>(5);
        Nodes<Integer> f = new Nodes<Integer>(6);
        Nodes<Integer> g = new Nodes<Integer>(7);
        Nodes<Integer> h = new Nodes<Integer>(8);
        Nodes<Integer> i = new Nodes<Integer>(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = null;
        Nodes<Integer> head = a;

//        Node ans = MergeSort(a);

//        System.out.println(ans.data);


    }
//    public static Node MergeSort(Node head) {
//        //base case
//        if(head==null && head.next==null) {
//            return head;
//        }
//        //find mid
//        Node mid = getMid(head);
//
//        //left & right ms
//        Node rightHead = mid.next;
//        mid.next = null;
//        Node newLeft = MergeSort(head);         //left half
//        Node newRight = MergeSort(rightHead);   //right half
//
//        //merge
//        return Merge(newLeft,newRight);
//    }
//
//    public static Node getMid(Node head) {
//        Node slow = head;
//        Node fast = head;
//
//        while(fast!=null && fast.next!=null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//
//    private static Node Merge(Node newLeft, Node newRight) {
//
//        Node mergedLL = new Node(-1);
//        Node temp = mergedLL;
//
//        while(newLeft != null && newRight != null) {
//            if(newLeft.data <= newRight.data) {
//                temp.next = newLeft;
//                newLeft = newLeft.next;
//                temp = temp.next;
//            }
//            else {
//                temp.next = newRight;
//                newRight = newRight.next;
//                temp = temp.next;
//            }
//       }
//        while(newLeft != null) {
//            temp.next = newLeft;
//            newLeft = newLeft.next;
//            temp = temp.next;
//        }
//        while(newRight != null) {
//            temp.next = newRight;
//            newRight = newRight.next;
//            temp = temp.next;
//        }
//    }
}
