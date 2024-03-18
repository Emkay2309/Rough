package Arrays.TwoDArray;

import java.util.Arrays;

public class FindTarget {
    public static void main(String[] args) {
        int [][] arr = {
                {3,4,7,9},
                {12,13,16,18},
                {20,21,23,29}
        };
        int target = 13;
        int [] ans = solve(arr , target);
        String value = Arrays.toString(ans);
        System.out.println(value);
    }
    static  int []  solve(int [][] mat , int t) {
        int [] ans = {-1,-1};
        int n = mat.length;
        int m = mat[0].length;

        int i=0;
        int j=(n*m-1);

        while( i <= j)  {
            int mid = (i+j)/2;

            int row = mid/m , col = mid%m;

            if(mat[row][col] == t) {
                ans[0] = row;
                ans[1] = col;
                return ans;
            }
            else if(mat[row][col] < t)  {
                i = mid+1;
            }
            else {
                j = mid-1;
            }
        }
        return ans;
    }
}
