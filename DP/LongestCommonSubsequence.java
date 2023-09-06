package DP;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";

        int[][] dp = new int [str1.length()+1] [str2.length()+1];

        for(int i=0 ; i<str1.length()+1 ; i++) {
            for(int j=0 ; j<str2.length()+1 ; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("LCSRecursion : " + LCSRecursion(str1 , str2 , str1.length() , str2.length()));
        System.out.println("LCSMemoization : " + LCSMemoization(str1 , str2 , str1.length() , str2.length() , dp ));
        System.out.println("LCSTabulation : " + LCSTabulation(str1 , str2 , str1.length() , str2.length()));
    }
    public static int LCSRecursion (String s1 , String s2 , int n , int m ) {
        if(n==0 || m==0) {
            return 0;
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)) {
            return LCSRecursion(s1 , s2 , n-1 , m-1) + 1;
        }
        else {
            int ans1 = LCSRecursion(s1 , s2 , n-1 , m);
            int ans2 = LCSRecursion(s1 , s2 , n , m-1);

            return Math.max(ans1 , ans2);
        }
    }
    public static int LCSMemoization (String s1 , String s2 , int n , int m , int[][] dp) {
        if(n==0 || m==0) return 0;

        if( dp[n][m] != -1) {
            return dp[n][m];
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)) {
            dp[n][m] = LCSMemoization(s1 , s2 , n-1 , m-1 , dp) + 1 ;
        }
        else {
            int ans1 = LCSMemoization(s1 , s2 , n-1 , m , dp);
            int ans2 = LCSMemoization(s1 , s2 , n , m-1 , dp);

            dp[n][m] = Math.max(ans1 , ans2);
        }
        return dp[n][m];

    }

    public static int LCSTabulation (String s1 , String s2 , int n , int m ) {
        int [] [] dp = new int [n+1] [m+1];

        for(int i=1 ; i<n+1 ; i++) {
            for(int j=1 ; j<m+1 ; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1 , ans2);
                }
            }
        }
        return dp[n][m];
    }
}
