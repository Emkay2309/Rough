package TwoD_Arrays;

import java.util.*;

public class SearchTargetMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        // Function call
        int [] ans = search(mat, 29);
        System.out.println(Arrays.toString(ans));
    }

    private static int [] search(int[][] mat, int k) {
        int n = mat.length;
        int i=0;
        int j=n-1;

        while( i < n   &&   j >= 0)  {
            //Found Target
            if(mat[i][j] == k)  {
                return new int [] {i,j};
            }
            //value > target
            if(mat[i][j] > k) {
                j--;
            }
            else if(mat[i][j] < k) {
                i++;
            }
        }
        return new int [] {-1,-1};
    }
}
