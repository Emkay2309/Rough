package Arrays;
import java.util.*;

public class flight {
    public static void main(String[] args) {

        int [] [] A = {
                {1,3,2},
                {2,4,1},
                {3,5,5},
        };
        int B = 5;
        System.out.println(Arrays.toString(solve(A,B)));
    }
    public static int [] solve( int [] [] A , int B ) {

        int ans [] = new int [B];

        for(int i=0 ; i<A.length ; i++ ) {

            int start = A[i][0] - 1;
            int end = A[i][1];
            int val = A[i][2];

            ans[start] += val;

            if( end != B ) {
                ans[end] -= val;
            }
        }

        for(int i=1 ; i<B ; i++) {
            ans[i] += ans[i-1];
        }
        return ans;
    }
}
