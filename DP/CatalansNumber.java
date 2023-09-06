package DP;
import java.util.*;

public class CatalansNumber {
    public static void main(String[] args) {
        int n = 4;
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        System.out.println("Recursion : " + rec(n));
        System.out.println("Memoization : " + mem(n,dp));
        System.out.println("Tabulation : " + tab(n) );
    }
    public static int rec(int n) {
        if(n==0 || n==1) return 1;

        int ans = 0;
        for(int i=0 ; i<n ; i++) {
            ans += rec(i) * rec(n-i-1);
        }
        return ans;
    }
    public static int mem(int n , int [] dp) {
        if(n==0 || n==1) {
            return 1;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for(int i=0 ; i<n ; i++) {
            ans += mem(i , dp) * mem(n-i-1 , dp);
        }
        return dp[n] = ans;
    }
    public static int tab (int n) {
        int [] dp = new int [n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2 ; i<=n ; i++) {
            for(int j=0 ; j<i ; j++) {
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}
