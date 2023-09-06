package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] A = {5,4,1,3,2};
        int [] ans = sort(A);
        System.out.println(Arrays.toString(ans));
    }
    public static int [] sort(int [] A) {
        for(int i=0 ; i<A.length-1 ; i++) {
            int swap = 0;
            for(int j=0 ; j<A.length-1-i ; j++) {
                if(A[j]>A[j+1]) {
                    //swap
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    swap++;
                }
            }
        }
        return A;
    }
}
