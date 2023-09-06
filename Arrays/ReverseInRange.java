package Arrays;
import java.util.*;

public class ReverseInRange {
    public static void main(String[] args) {
        int [] A = {1,2,3,4};
        int B = 2;
        int C = 3;
        int [] ans = solve(A,B,C);
        System.out.println(Arrays.toString(ans));
    }
    public static int [] solve(int [] A , int B , int C) {

        while(B < C) {
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }
        return A;
    }
}
