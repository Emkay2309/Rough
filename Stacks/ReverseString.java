package Stacks;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "HelloWorld!";
        String ans = reverseString(str);
        System.out.println(ans);
    }

    public static String reverseString(String str ) {
        Stack <Character> s = new Stack<>();
        int index = 0;

        while(index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static Stack<Integer> revreseStack(Stack<Integer> s) { //using extra space
        Stack<Integer> ans = new Stack<>();
        int index = 0;
        while(!s.isEmpty()) {
            int value = s.pop();
            ans.push(value);
        }
        return ans;
    }
}
