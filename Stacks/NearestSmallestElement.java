package Stacks;

import java.util.Stack;
import java.util.*;

public class NearestSmallestElement {
    public static void main(String[] args) {
        int [] A = {3,10,6,1,4};
        int [] ans = solve(A);

        System.out.println(Arrays.toString(ans));

        ans = nextSmallerElement(A, ans);
        System.out.println(Arrays.toString(ans));
    }

    public static int [] nextSmallerElement(int[] A, int[] ans) {
        Stack <Integer> s = new Stack<>();

        for(int i=A.length-1 ; i>=0 ; i--) {

            while(!s.isEmpty() && A[s.peek()] >= A[i]) {   // 3 <= 1
                s.pop();
            }

            if(s.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = A[s.peek()];      // -1, 3
            }
            s.push(i);
        }
        return ans;
    }
    public static int [] solve(int [] A) {
        int n = A.length;
        int index[] = new int [n];

        for(int i=0 ; i<index.length ; i++) {
            index [i] = -1;
        }

        for(int i=0 ; i<n ; i++) {
            for(int j=i+1 ; j<n ; j++) {
                if (A[i] > A[j]) {
                    index[i] = A[j];
                    break;
                }
            }
        }

        return index;
    }
}
