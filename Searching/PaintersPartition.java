package Searching;

public class PaintersPartition {
    public static void main(String[] args) {
        int [] A = {3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};
        int k = 3;
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            max = Math.max(max , A[i]);
        }

        if(k==A.length) {
            System.out.println(max);
        }
        else {
            System.out.println(solve(A,k));
        }
    }
    public static int solve(int [] A , int k) {

        int TotalSum = 0;
        for(int i=0 ; i<A.length ; i++) {
            TotalSum += A[i];
        }
        int s = 0;
        int e = TotalSum;
        int ans = 0;
        while(s<=e) {
            int mid = (s+e)/2;

            if( isPossible(A,k,mid) == true){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int [] A, int k , int mid) {
        int sum = 0;
        int count = 1;

        for(int i = 0; i < A.length; i++) {
            sum += A[i];

            if(sum > mid) {
                count++;
                sum = A[i];
                if(count > k) {
                    return false;
                }
            }
        }
        return true;
    }
}
