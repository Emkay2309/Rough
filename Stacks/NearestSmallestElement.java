package Stacks;

import java.util.Stack;
import java.util.*;

public class NearestSmallestElement {
    public static void main(String[] args) {
        int [] A = {3,10,6,1,4};
        int [] ans = solve(A);

        System.out.println(Arrays.toString(ans));
    }
    public static int [] solve(int [] A) {
        int n = A.length;
        int index[] = new int [n];

        for(int i=0 ; i<index.length ; i++) {
            index [i] = -1;
        }

        for(int i=0 ; i<n ; i++) {
            for(int j=i-1 ; j>=0 ; j--) {
                if (A[i] > A[j]) {
                    index[i] = j;
                    break;
                }
            }
        }

        return index;
    }
}
