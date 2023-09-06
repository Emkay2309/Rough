package LinkedList;

public class add2Numbers {
    static class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LinkedListNode l1 = new LinkedListNode(3);
        LinkedListNode l2 = new LinkedListNode(2);

        System.out.println(addTwoNumbers(l1,l2).data);
    }


        public static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
            // Write your code here.

            if(head1 == null) {
                return head2;
            }
            if(head2 == null) {
                return head1;
            }
            LinkedListNode dummy = new LinkedListNode(-1);
            LinkedListNode ans = dummy;
            int carry = 0;

            while( head1 != null || head2 != null) {

                int head1_value = (head1 != null) ? head1.data : 0;
                int head2_value = (head2 != null) ? head2.data : 0;

                int currValue = head1_value + head2_value + carry;
                int last = currValue%10;
                carry = currValue/10;

                LinkedListNode newNode = new LinkedListNode(last);
                ans.next = newNode;

                if(head1 != null) {
                    head1 = head1.next;
                }
                if(head2 != null) {
                    head2 = head2.next;
                }
                ans = ans.next;
            }

            if(carry > 0) {
                LinkedListNode newNode = new LinkedListNode(carry);
                ans.next = newNode;
                ans = ans.next;
            }

            return dummy.next;
        }
}
