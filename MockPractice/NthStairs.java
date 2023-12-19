package MockPractice;

import java.util.*;
public class NthStairs {
    public static void main(String[] args) {
        int n = 5;
        int [] dp =   new int [n+1];
        Arrays.fill(dp , -1);
        System.out.println(nStairs(n , dp));
        System.out.println(fun(n ));
    }
    static int nStairs(int n , int [] dp) {
        if( n == 1 || n == 2 ) {
            return n;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        dp[n] =  nStairs(n-1 ,dp) + nStairs(n-2 ,dp);
        return dp[n];
    }

    static  int  fun(int n) {
        int [] dp = new int [n+1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3 ; i<=5 ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];


    }
}
