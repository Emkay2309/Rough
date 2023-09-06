package Stacks;
import java.util.*;

public class NextGreater {
    public static void main(String[] args) {
        int [] A = {6,8,0,1,3};
        int ans [] = new int [A.length];
        System.out.println(Arrays.toString(nextGreaterElement(A,ans)));
    }

    public static int [] nextGreaterElement(int[] A, int[] ans) {
        Stack <Integer> s = new Stack<>();

        for(int i=A.length-1 ; i>=0 ; i--) {
            while(!s.isEmpty() && A[s.peek()] <= A[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = A[s.peek()];
            }
            s.push(i);
        }
        return ans;
    }
}
