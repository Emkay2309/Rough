package DP;

public class MazePath {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        Integer [] [] dp = new Integer[n][m];

        System.out.println(solveMemoization(n-1,m-1,dp));

        System.out.println(solveTabulation(n,m));
    }
    private static  int solveMemoization(int n, int m , Integer [] [] dp) {
        if( n < 0 || m < 0 ) return 0;

        if( n==0 || m==0) return 1;

        if(dp[n][m] != null) {
            return dp[n][m];
        }

        int way1 = solveMemoization(n-1 , m , dp);
        int way2 = solveMemoization(n , m-1 , dp);

        dp[n][m] = way1 + way2;
        return dp[n][m];
    }

    private static  int solveTabulation(int n, int m ) {
        int [] [] dp = new int [n][m];

        for(int i=0 ; i<dp.length ; i++) {
            dp[i][0] = 1;
        }
        for(int j=0 ; j<dp[0].length ; j++) {
            dp[0][j] = 1;
        }

        for(int i=1 ; i<n ; i++) {
            for(int j=1 ; j<m ; j++) {
                dp[i][j] = dp [i-1][j] + dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }
}
