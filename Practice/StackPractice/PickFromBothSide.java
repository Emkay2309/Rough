package Practice.StackPractice;

public class PickFromBothSide {
    public static void main(String[] args) {
        int[] A = {2, 3, -1, 4, 2, 1};
        int B = 4;
        System.out.println(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        int n = A.length;
        int max = 0;
        for(int i=0 ; i<B ; i++) {
            max += A[i];
        }

        int val = max;

        for(int i=B-1 ; i>=0 ; i--) {
            int j = n+i-B;

            val = val -  A[i];
            val = A[j] + val;
            max = Math.max(val , max);
        }
        return max;
    }
}