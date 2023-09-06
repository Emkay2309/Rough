package Practice.StackPractice;

import java.util.ArrayList;

public class StackUsingArray {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

    }
    public static  class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        //isEmpty
        public boolean isEmpty() {
            return list.size()==0;
        }

        //peek
        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }

        //pop()
        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int value = list.remove(list.size()-1);
            return value;
        }

        //push
        public void push(int data) {
            list.add(data);
        }
    }
}
