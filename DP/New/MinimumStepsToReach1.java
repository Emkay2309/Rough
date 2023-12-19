package DP.New;
import java.util.*;

public class MinimumStepsToReach1  {
    public static void main(String[] args) {
        int n = 10;
        int [ ]dp = new int [n+1];
        Arrays.fill(dp,-1);
        System.out.println(minimum(n , dp));
        System.out.println(tabulation(10));
    }

    static int tabulation(int n)  {
        int [] dp = new int [n+1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i=2 ; i<=n ; i++)  {
            int min = dp[i-1];

            if(i%3 == 0) {
                if(min > dp[i/3]) {
                    min = dp[i/3];
                }
            }
            if(i%2 == 0) {
                if(min > dp[i/2])  {
                    min = dp[i/2];
                }
            }
            dp[i] = 1 + min;
        }
        return dp[n];
    }
    static int minimum(int n , int [] dp) {
        if(n==1) {
            return 0;
        }

        if(dp[n] != -1) {
            return dp[n];
        }
        int minus1 = minimum(n-1 , dp);
        int min = minus1;

        if(n % 2 == 0) {
            int div2 = minimum(n/2 , dp);
            if(div2 < min) {
                min = div2;
            }
        }

        if(n % 3 == 0) {
            int div3 = minimum(n/3 , dp);
            if(div3 < min) {
                min = div3;
            }
        }
        dp[n] = 1+min;
        return 1+min;
    }
}
