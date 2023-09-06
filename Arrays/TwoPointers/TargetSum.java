package Arrays.TwoPointers;
import java.util.*;

public class TargetSum {
    public static void main(String [] args) {
        int [] A = {3,7,8,11,14,19,20};
        int k = 25;
        System.out.println("Brute Force Approach : " + check(A , k));
        System.out.println("Hashing Approach : " + CheckTarget(A,k));
        System.out.println("Two Pointers Approach : " + CheckOptimizedTarget(A,k));
    }
    //Brute Force
    public static boolean check(int [] A , int k) {
        int n = A.length;

        for(int i=0; i<n-1 ; i++) {
            for(int j=i+1 ; j<n ; j++) {
                if(A[i]+A[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
    //Hashing
    public static boolean CheckTarget(int [] A , int k) {
        int n = A.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0 ; i<n ; i++) {
            set.add(A[i]);
        }

        for(int i=0 ; i<n ; i++) {
            if(set.contains(k-A[i])) {
                return true;
            }
        }
        return false;
    }
    //Two Pointers
    public static boolean CheckOptimizedTarget(int [] A , int k) {
        int n = A.length;
        int start = 0;
        int end = n-1;

        while(start < end) {
            int value = A[start] + A[end];
            if(value == k) {
                return true;
            }
            else if(value > k) {
                end--;
            }
            else {
                start++;
            }
        }
        return false;
    }
}
