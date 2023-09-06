package Stacks;
import java.util.*;

public class DuplicateParenthesis {
    public static void main(String[] args) {
        String str = "(a-b)";
        System.out.println(checkDuplicate(str));
    }

    public static boolean checkDuplicate(String str) {
        Stack <Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')' ) {
                int count=0;
                while(!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true;
                }
                else {
                    s.pop();
                }
            }
            else {
                s.push(ch);
            }
        }
        return false;
    }
}
