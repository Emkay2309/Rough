package Sorting;

import java.util.Arrays;

public class QuicSort {
    public static void main(String[] args) {
        int [] A = {6,3,9,8,2,5};
        int n = A.length;

        quickSort(A,0,n-1);
        System.out.println(Arrays.toString(A));
    }

    public static void quickSort(int [] A , int si , int ei) {
        if(si >= ei) {
            return ;
        }
        //last element
        int partitionIndex = partition(A,si,ei);
        quickSort(A,si,partitionIndex-1);//left part
        quickSort(A,partitionIndex+1,ei);//right part
    }

    public static int partition(int[] A, int si, int ei) {
        int pivot = A[ei];
        int i = si-1; //to make place for elements smaller than pivot

        for(int j=si ; j<ei ; j++) {
            if(A[j] <= pivot) {
                i++;
                //swap
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        A[ei] = A[i];
        A[i] = temp;
        return i;
    }
}
