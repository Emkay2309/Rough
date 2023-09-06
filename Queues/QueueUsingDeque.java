package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    public static class Queue {
        static Deque<Integer> dq = new LinkedList<>();

        public static void add(int data) {
            dq.addLast(data);
        }
        public static int remove() {
            return dq.removeFirst();
        }
        public static int peek() {
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
    }
}
