package Greedy_Algorithmn;

import java.util.Arrays;

public class Min_Absolute_Difference_Pairs {
    public static void main(String[] args) {
        int [] A  = {4,1,8,7};
        int [] B = {2,3,6,5};
        System.out.println(solve(A,B));
    }

    public static int solve(int [] A , int [] B) {
        int ans = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0 ; i<A.length ; i++) {
            ans += Math.abs( A[i]-B[i]);
        }
        return ans;
    }
}
