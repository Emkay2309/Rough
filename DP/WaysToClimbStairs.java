package DP;

import java.util.*;

public class WaysToClimbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] A = new int [n+1];

        for(int i=0 ; i<=n ; i++) {
            A[i]= -1;
        }
        int ans = ways(n , A);
        System.out.println("2 steps allowed -- Memoization : " + ans);

        Arrays.fill(A,-1);

        int ans2 = ThreeSteps(n, A);
        System.out.println("3 steps allowed : " + ans2);

        Arrays.fill(A , -1);
        int ansTabulation = twoSteps(n);
        System.out.println("2 steps allowed -- Tabulation: " + ansTabulation);

    }

    private static int ways(int n, int[] arr) {
        if(n==2 || n==1) {
            return n;
        }
        if(arr[n] != -1) {
            return arr[n];
        }
        arr[n] = ways(n-1 , arr) + ways(n-2 , arr);
        return arr[n];
    }
    private static int ThreeSteps(int n, int[] arr) {
        if(n<=0) {
            return 1;
        }
        if(n==2 || n==1) {
            return n;
        }
        if(arr[n] != -1) {
            return arr[n];
        }
        arr[n] = ThreeSteps(n-1 , arr) + ThreeSteps(n-2 , arr) + ThreeSteps(n-3 , arr);
        return arr[n];
    }

    //Tabulation
    public static int twoSteps( int n ) {
        int [] dp = new int [n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2 ; i<=n ; i++) {
            dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}