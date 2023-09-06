package LinkedList;

import java.util.List;

public class Merge2SortedLL {
    public class ListNode{
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode anshead = new ListNode(-1);
        ListNode exactHead = anshead.next;

        while(head1 != null  && head2 != null) {

            if(head1.val < head2.val) {
                anshead.next = head1;
                anshead = anshead.next;
                head1 = head1.next;
            }
            else {
                anshead.next = head2;
                anshead = anshead.next;
                head2 = head2.next;
            }
        }

        if(head1 != null) {
            anshead.next = head1;
        }
        if(head2 != null) {
            anshead.next = head2;
        }

        return exactHead;

    }
    public void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next =  new ListNode(3);
        list1.next.next =  new ListNode(5);
        ListNode l = list1;
        while(l != null) {
            System.out.println(l.val);
            l = l.next;
        }

        ListNode list2 = new ListNode(2);
        list2.next =  new ListNode(4);
        list2.next.next =  new ListNode(6);

        ListNode answer = mergeTwoLists(list1 , list2);

        while(answer != null) {
            System.out.println(answer.val);
            answer = answer.next;
        }

        System.out.println("hello");
    }
}


