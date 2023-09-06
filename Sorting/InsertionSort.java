package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] A = {5, 4, 1, 3, 2};
        int[] ans = sort(A);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int curr = A[i] ;
            int prev = i-1;

            //finding out the correct position to insert
            while(prev >=0 && A[prev] > curr) {
                A[prev+1] = A[prev];
                prev--;
            }
            //insertion
            A[prev+1] = curr;
        }
        return A;
    }
}
