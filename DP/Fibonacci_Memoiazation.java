package DP;

import java.util.*;

public class Fibonacci_Memoiazation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] A = new int [n+1];

        for(int i=0 ; i<=n ; i++) {
            A[i]= -1;
        }
        int ans = fib(n , A);
        System.out.println(ans);
    }

    private static int fib(int n, int[] arr) {
        if(n==0 || n==1) {
            return n;
        }

        if(arr[n] != -1) {
            return arr[n];
        }
        arr[n] = fib(n-1 , arr) + fib(n-2 , arr);
        return arr[n];
    }
}
