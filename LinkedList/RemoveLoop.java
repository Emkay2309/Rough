package LinkedList;

import static LinkedList.LinkedListUse.print;

public class RemoveLoop {
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
        i.next = d;

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = d;
        Nodes<Integer> head = a;

        RemoveLoopCycle(head);
        print(head);

    }
    public static void RemoveLoopCycle (Nodes<Integer> head) {
        //detect cycle
        Nodes<Integer> slow = head;
        Nodes<Integer> fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                cycle = true;
                break;
            }
        }
        if(cycle==false) {
            return;
        }
        //find meeting point
        slow = head;
        Nodes<Integer> prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle --> lastNode.next = null
        prev.next = null;
    }
}
