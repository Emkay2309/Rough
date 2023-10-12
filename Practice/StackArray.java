package Practice;

public class StackArray {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        while(s.isEmpty() == false)  {
            System.out.println(s.pop());
        }
    }
    static class Stack {
        int [] arr;
        int top = -1;
        int cap ;

        Stack(int cap) {
            this.cap = cap;
            arr = new int [cap];
        }

        void push(int x) {
            top++;
           arr[top] = x;
        }

        int pop () {
            if(top != -1) {
                int val = arr[top];
                top--;
                return val;
            }
            return -1;
        }

        int peek () {
            if(top != -1) {
                int val = arr[top];
                return val;
            }
            return -1;
        }

        boolean isEmpty() {
            return top == -1;
        }
    }
}
