package Searching;

public class NCowsMStalls {
    public static void main(String[] args) {
//        int[] A = {2, 6, 11, 14, 19, 25, 30, 39, 43};
        int [] A = {5, 17, 100, 11 };
        int cows =2;
//        int cows = 4;
        System.out.println(solve(A, cows));
    }

    public static int solve(int[] A, int cows) {

        int s = Integer.MAX_VALUE;
        for (int i = 1; i < A.length; i++) {
            int value = A[i] - A[i - 1];
            s = Math.min(s, value);
        }
        int e = A[A.length - 1] - A[0];
        int ans = s;

        while (s <= e) {
            int mid = (s + e) / 2;

            boolean res = isPossible(A, cows, mid);

            if (res == true) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] A, int cows, int mid) {
        int lastPlaced = A[0];
        int count = 1;

        for (int i = 0; i < A.length; i++) {
            if ((A[i] - lastPlaced) >= mid) {
                count++;
                lastPlaced = A[i];

                if (count == cows) {
                    return true;
                }
            }
        }
        return false;
    }
}
