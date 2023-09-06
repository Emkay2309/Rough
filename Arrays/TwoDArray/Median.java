package Arrays.TwoDArray;

public class Median {
    public static void main(String[] args) {
        int [] [] A = {
                {1,3,5},
                {2,6,9},
                {3,8,9}
        };
        System.out.println(MatrixMedian(A));
    }
    public static int MatrixMedian(int [] [] A) {
        int n = A.length;
        int m = A[0].length;

        int total = n*m;
        int mid = (total-1)/2;

        int row = mid/n ;
        int col = mid%m;

        int val = A[row][col];

        int min = minCount(A , val);
        int max = total - min - 1;

        if(min == max) {
            return val;
        }
        return -1;

    }
    public static int minCount(int [][] A , int val) {
        int n = A.length;
        int m = A[0].length;

        int count = 0;
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                if(A[i][j] <= val) {
                    count++;
                }
                if(A[i][j] == val) {
                    return count;
                }
            }
        }
        return count;
    }
}
