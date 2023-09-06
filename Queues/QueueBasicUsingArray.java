package Queues;

public class QueueBasicUsingArray {
    public static class Queue {

        static int size;
        static int rear;
        static int [] A;
        Queue (int n) {
            A = new int [n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if(rear==size-1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            A[rear] = data;
        }
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = A[0];
            for(int i=0 ; i<rear ; i++) {
                A[i] = A[i+1];
            }
            rear -= 1;
            return front;
        }
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return A[0];
        }
        public static int size() {
            return rear+1;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println(q.size());
        System.out.println(q);
    }
}
