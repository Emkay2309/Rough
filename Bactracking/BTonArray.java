package Bactracking;

import java.util.Arrays;

public class BTonArray {
    public static void main(String[] args) {
        int[] A = new int [5];
        ChangeArray(A,0,1);
        System.out.println(Arrays.toString(A));
    }
    public static void ChangeArray( int [] A ,int i , int val) {
        //base case
        if(i==A.length) {
            System.out.println(Arrays.toString(A));
            return;
        }
        //recursion
        A[i] = val;
        ChangeArray(A , i+1 , val+1);
        A[i] = A[i]-2;
    }
}