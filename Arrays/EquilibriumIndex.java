package Arrays;

import java.util.*;
public class EquilibriumIndex {
    public static void main(String[] args) {
        int [] arr = {-7, 1, 5, 2, -4, 3, 0};
        int [] arr1 = {1, 2, 3};
        System.out.println(solve(arr));
        System.out.println(solve(arr1));
    }
    static int solve(int [] arr) {
        int ans = -1;
        int sum = 0;
        int [] pfSum = new int [arr.length];

        for(int i=0 ; i<arr.length ; i++) {
            sum += arr[i];
            pfSum[i] = sum;
        }

        int n = arr.length;
        for(int i=1 ; i<arr.length-1 ; i++) {
            int left = pfSum[i-1];
            int right = pfSum[n-1] - pfSum[i];

            if(right == left) {
                return i;
            }
        }
        return ans;
    }
}
