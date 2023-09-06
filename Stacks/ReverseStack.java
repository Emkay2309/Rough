package Stacks;
import java.util.*;

public class ReverseStack {
    public static void main(String[] args) {
        Stack <Integer> s =  new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s);
        reverseStackLinear(s);
        System.out.println(s);
        Stack<Integer> rev = reverse(s);
        System.out.println("reverse : "+rev);
    }
    public static void reverseStackLinear(Stack <Integer> s) { //using no space O(1)
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStackLinear(s);
        pushAtBottom(s,top);
    }
    public static void pushAtBottom(Stack <Integer> s , int data){
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top1 = s.pop();
        pushAtBottom(s,data);
        s.push(top1);
    }
    public static Stack<Integer> reverse(Stack<Integer> s ) {
        Stack<Integer> ans = new Stack<>();

        while(!s.isEmpty()) {
            int top = s.pop();
            ans.push(top);
        }
        return ans;
    }
}
