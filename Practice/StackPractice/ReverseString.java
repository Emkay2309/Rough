package Practice.StackPractice;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abc";
        String ans = reverse(str);
        System.out.println(ans);
    }
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int n = str.length();
        int index = 0;

        while(index < n) {
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder ans = new StringBuilder("");

        while(!s.isEmpty()) {
            char curr = s.pop();
            ans.append(curr);
        }
        return ans.toString();
    }
}
