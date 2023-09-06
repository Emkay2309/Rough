package Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] A = {5, 4, 1, 3, 2};
        int[] ans = sort(A);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sort(int[] A) {
        for (int i = 0; i < A.length-1; i++) {
            int minPos = i ;
            for (int j = i+1; j < A.length ; j++) {
                if (A[minPos] > A[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = A[minPos];
            A[minPos] = A[i];
            A[i] = temp;
        }
        return A;
    }
}
