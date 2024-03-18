package Arrays.TwoDArray;

public class Search2 {
    public static void main(String[] args) {
        int [][] arr = {
                {3,4,7,9},
                {12,13,16,18},
                {20,21,23,29}
        };
        int target = 13;

        System.out.println(solve(arr , target));
        System.out.println(binary(arr , target));
    }
    static  boolean solve(int [][] arr , int t)  {
        int n = arr.length;
        int m = arr[0].length;

        int row = 0;
        int col = m-1;

        while( row < n && col >= 0)  {
            int val = arr[row][col];

            if(val == t) {
                return true;
            }
            else if(val > t)  {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
    static  boolean binary(int [][] mat , int t) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0 , high = n*m-1;

        while(low <= high)  {
            int mid = (low+high)/2;

            int row = mid/m;
            int col = mid%m;

            if(mat[row][col] == t)  {
                return true;
            }
            else if(mat[row][col] > t) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return true;
    }
}
