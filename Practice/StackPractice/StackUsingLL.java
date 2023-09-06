package Practice.StackPractice;

public class StackUsingLL {
    public static void main(String[] args) {
        StackUsingArray.Stack s = new StackUsingArray.Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
    public static class  StackLL {

        static class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
                this.next = null;
            }
        }

        static  class Stack {
            Node head = null;

            //isEmpty
            public boolean isEmpty() {
                return head == null;
            }

            //peek
            public int peek() {
                if (isEmpty()) {
                    return -1;
                }
                return head.val;
            }

            //pop()
            public int pop() {
                if(isEmpty()) {
                    return -1;
                }
                int top = head.val;
                head = head.next;
                return top;
            }

            //add
            public void push(int data) {
                Node newNode = new Node(data);
                if(isEmpty()) {
                    head = newNode;
                }

                newNode.next = head;
                head = newNode;
            }

        }
    }
}
