package Stacks;
import java.util.*;
public class PushAtBottomImportant {
    public static void main(String[] args) {
        Stack <Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);

        pushAtBottom(S,4);

        while(!S.isEmpty()) {
            System.out.println(S.peek());
            S.pop();
        }
    }

    public static void pushAtBottom(Stack <Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

}
