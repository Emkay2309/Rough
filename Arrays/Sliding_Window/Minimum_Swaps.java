package Arrays.Sliding_Window;
import java.util.*;
public class Minimum_Swaps {
    public static  int solve(int[] A, int B) {
//        int tc = (int)Arrays.stream(A).filter(i -> i <= B).count();
//        System.out.println(tc);
//        int swap = (int)Arrays.stream(A).limit(tc).filter(i -> i > B).count();
//        System.out.println(swap);

        int tc = 0;
        for(int x : A) {
            if(x <= B) {
                tc++;
            }
        }

        int swap = 0;
        for(int i=0 ; i<tc ; i++) {
            if(A[i] >= B) {
                swap++;
            }
        }
        int res = swap;
        int j = 0;
        for(int i = tc; i < A.length; i++){
            if(A[j] > B) swap--;
            if(A[i] > B) swap++;
            res = Math.min(swap, res);
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] A = { 1, 12, 10, 3, 14, 10, 5 };
        int ans = solve(A,8);
        System.out.println(ans);
    }
}