package Bactracking;

public class BacktrackingOnArray {
    public static void main(String[] args) {
        int [] arr = new int [5];
        changeArr(arr,0,1);
        print(arr);

    }
    public static void print(int [] A) {
        for(int i=0 ; i<A.length ; i++) {
            System.out.print(A[i]+" ");
        }
    }
    public static void changeArr(int [] a , int i , int val) {
        //base case
        if(i == a.length) {
            return;
        }
        //recursion
        a[i] = val;
        changeArr(a,i+1,val+1);
    }
}
