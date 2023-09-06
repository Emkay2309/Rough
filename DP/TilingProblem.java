package DP;

public class TilingProblem {
        public int tilingRectangle(int n, int m) {
            // Create a 2D array to store the minimum number of squares needed for each sub-rectangle
            int[][] dp = new int[n + 1][m + 1];

            // Initialize the array with a large value
            int MAX_VALUE = Integer.MAX_VALUE - 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    dp[i][j] = MAX_VALUE;
                }
            }

            // Fill the array using dynamic programming
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    // If the rectangle is already a square, no need for further tiling
                    if (i == j) {
                        dp[i][j] = 1;
                    } else {
                        // Try all possible vertical divisions and horizontal divisions to find the minimum
                        for (int k = 1; k <= i / 2; k++) {
                            dp[i][j] = Math.min(dp[i][j], dp[k][j] + dp[i - k][j]);
                        }
                        for (int k = 1; k <= j / 2; k++) {
                            dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[i][j - k]);
                        }
                    }
                }
            }

            return dp[n][m];
        }

        public static void main(String[] args) {
            TilingProblem tilingRectangle = new TilingProblem();
            int n = 11;
            int m = 13;
            int result = tilingRectangle.tilingRectangle(n, m);
            System.out.println("Minimum number of squares: " + result);
        }

}
