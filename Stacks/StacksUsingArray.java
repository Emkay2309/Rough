package Stacks;

public class StacksUsingArray {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()) {
            System.out.print(s.pop() +" ");
        }
    }

    static class Stack {
        int arr [] ;
        int size = -1;
        int capacity;

        Stack(int capacity) {
            arr = new int [capacity];
            this.capacity = capacity;
        }

        public void push(int x) {
            size++;    //-1 -> 0->x
            arr[size] = x;
        }

        public int pop() {
            if(size != -1)  {                //  -1  0  1  2
                int val = arr[size];             //  4 ,5 ,7
                size--;
                return val;
            }
            return -1;
        }

        public int peek() {
            if(size != 0) {
                int val = arr[size];
                return val;
            }
            return -1;
        }

        public boolean isEmpty() {
            return size == -1;
        }

        public int isFull() {
            if (size == capacity - 1) {
                return 1;
            }
            return 0;
        }
    }
}
