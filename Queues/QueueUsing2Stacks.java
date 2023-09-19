package Queues;



import java.util.Stack;

public class QueueUsing2Stacks {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.poll();
        }
    }
    public static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        //add O(N)
        public static void push(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        //remove
        public static int poll() {
            if(isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return s1.peek();
        }

    }
}

