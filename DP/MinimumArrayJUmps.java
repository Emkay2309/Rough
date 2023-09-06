package DP;
import java.util.*;


public class MinimumArrayJUmps {
    public static void main(String[] args) {
        int [] A = {2,3,1,1,4};
        int  [] dp = new int [A.length+1];
        Arrays.fill(dp , -1);

        System.out.println("Jumps : " + solve(A, 0 , dp));
    }

    private static int  solve(int[] A, int j, int[] dp) {
        int sum = 0;
        for(int i=1 ; i<A.length ; i++) {
            sum = Math.max(sum-1 , A[i]);
            if(sum==0 && i<A.length-1) {
                return -1;
            }
        }
        return sum;
    }
}
