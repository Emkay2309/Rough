package MockPractice;

import java.util.Stack;

public class QueuesImple { //fifo
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        System.out.println(q.peek()); // 1
        System.out.println(q.isEmpty()); // false;
        System.out.println(q.poll());   // 1
        System.out.println(q.size());  // 3

    }

    static class Queue {
        Stack<Integer> s1 ;
        Stack<Integer> s2 ;

        Queue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        // check empty
        boolean isEmpty() {
            return s1.isEmpty();
        }

        // add  TC : O(N)
        void push(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }

        // remove
        int poll() {  // tc : O(1)
            if(s1.isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        // peek   //tc : O(1)
        int peek() {
            if(s1.isEmpty()) {
                return -1;
            }
            int val =  s1.peek();
            return val;
        }


        //size  tc : o(1)
        int size() {
            return s1.size();
        }
    }
}
