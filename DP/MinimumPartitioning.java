package DP;

public class MinimumPartitioning {
    public static void main(String[] args) {
        int [] A = {1,6,11,5};
        System.out.println("" +solve(A));
    }
    public static int solve( int [] A) {
        int n = A.length;
        int sum = 0;
        for(int i=0 ; i<n ; i++) {
            sum += A[i];
        }
        int w = sum/2;

        int [][] dp = new int [n+1][w+1];

        for(int i=1 ; i<=n ; i++) {
            for(int j=1 ; j<=w ; j++) {
                //valid
                if( A[i-1] <= j) {
                    dp[i][j] = Math.max( A[i-1] + dp[i-1][j-A[i-1]] , dp[i-1][j]);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][w];
        int sum2 = sum - sum1;
        return Math.abs(sum1-sum2);
    }
}
