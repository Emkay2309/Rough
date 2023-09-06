package Sorting;

public class SearchRotatedSortArray {
    public static void main(String[] args) {
        int [] A = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(A,target,0,A.length-1));
    }
    public static int search(int [] A , int tar , int si , int ei) {
        //base case
        if(si > ei) {
            return -1;
        }
        int mid = si+(ei-si)/2;

        //case found
        if(A[mid]==tar) {
            return mid;
        }

        //mid on l1
        if(A[si] <= A[mid]) {
            //case a :left
            if (A[si] <= tar && tar <= A[mid]) {
                return search(A, tar, si, mid);
            } else {
                //case b : right
                return search(A, tar, mid + 1, ei);
            }
        }
        //mid on l2
        else{
            //case c : right
            if(A[mid] <= tar && tar <= A[ei]){
                return search(A,tar,mid+1,ei);
            }
            else {
                //case d : left
                return search(A,tar,si,mid-1);
            }
        }
    }
}
