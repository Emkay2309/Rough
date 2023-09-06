package DP;

public class MinPathSum {
    public static void main(String[] args) {
        int [] [] A = {
                        {2,3,5},
                        {1,6,4},
                        {9,2,7}
                      };

        int [] [] dp = new int [A.length] [A[0].length];

        dp[0][0] = A[0][0];
        for(int i=1 ; i<A.length ; i++) {
            dp[i][0] = dp[i-1][0] + A[i][0];
        }
        for(int j=1 ; j<A[0].length ; j++) {
            dp[0][j] = dp[0][j-1] + A[0][j];
        }

        for(int i=1 ; i<dp.length ; i++) {
            for(int j=1 ; j<dp[0].length ; j++) {
                dp[i][j] = Math.min(dp[i-1][j] , dp[i][j-1]) + A[i][j];
            }
        }
        System.out.println("Minimun Path Sum : "+dp[A.length-1][A[0].length-1]);

        for(int i=0 ; i<dp.length ; i++) {
            System.out.print("{ ");
            for(int j=0 ; j<dp[0].length ; j++) {
                System.out.print(dp[i][j]+",");
            }
            System.out.println(" }");
        }
    }
}
