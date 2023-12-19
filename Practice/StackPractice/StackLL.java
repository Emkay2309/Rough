package Practice.StackPractice;

public class StackLL {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    static  class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = next;
        }
    }
    static  class Stack {
        Node head = null;

        boolean isEmpty() {
            return head == null;
        }

        void push(int x) {
            Node newHead = new Node(x);
            if(isEmpty()) {
                head = newHead;
                return;
            }
            newHead.next = head;
            head = newHead;
        }

        int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }

        int peek() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.val;
            return top;
        }


    }
}
