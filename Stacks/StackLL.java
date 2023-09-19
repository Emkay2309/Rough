package Stacks;

public class StackLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        static Node head = null;

        public  boolean isEmpty() {
            return head == null;
        }

        //push
        public void push(int data) {
            Node newNode = new Node(data);  //3
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop
        public  int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public  int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack S = new Stack();

        S.push(1);
        S.push(2);
        S.push(3);

        while(!S.isEmpty()) {
            System.out.println(S.peek());
            S.pop();
        }
    }
}
