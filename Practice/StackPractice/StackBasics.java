package Practice.StackPractice;

import java.util.ArrayList;

public class StackBasics {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        //check empty data
        public static boolean isEmpty() {
            return list.size()==0;
        }

        //push
        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek() {
            System.out.println(list.get(list.size()-1));
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        s.peek();

        while(!s.isEmpty()) {
            s.peek();
            s.pop();
        }
    }
}
