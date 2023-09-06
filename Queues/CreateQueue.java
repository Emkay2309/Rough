package Queues;

import java.util.*;

public class CreateQueue {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());

    }

    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();


        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        //add O(N)
        public static void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        //peek function
        //remove
        public static int remove() {
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

