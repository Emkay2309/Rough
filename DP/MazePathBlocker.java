package DP;

public class MazePathBlocker {
    public static void main(String[] args) {
        int[][] A = {
                {0, 0, 0},
                {1, 1, 1},
                {0, 0, 0}
        };

        Integer[][] dp = new Integer[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1) {
                    dp[i][j] = 0;
                }
            }
        }

        int ans = 1;
        for(int i=0 ; i<A.length ; i++) {
            if(A[i][0] == 1) {
                ans = 0;
            }
            dp[i][0] = ans;
        }

        ans = 1;
        for(int j=0 ; j<A[0].length ; j++) {
            if(A[0][j] == 1) {
                ans = 0;
            }
            dp[0][j] = ans;
        }

        for(int i=0 ; i<dp.length ; i++) {
            System.out.print("{ ");
            for(int j=0 ; j<dp[0].length ; j++) {
                System.out.print(dp[i][j]+",");
            }
            System.out.println(" }");
        }

        for(int i=1 ; i<A.length ; i++) {
            for(int j=1 ; j<A[0].length ; j++) {
                if( dp[i][j] == null) {
                    dp[i][j] = dp[i-1][j] + dp [i][j-1];
                }
            }
        }

        for(int i=0 ; i<dp.length ; i++) {
            System.out.print("{ ");
            for(int j=0 ; j<dp[0].length ; j++) {
                System.out.print(dp[i][j]+",");
            }
            System.out.println(" }");
        }
    }
}
