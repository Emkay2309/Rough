package Arrays.TwoDArray;

public class DiagonalSum {
    public static void main(String[] args) {
        int [] [] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("Diagonal sum : " + solve(mat));
    }
    static  int solve(int [][] mat)  {
        int n = mat.length;
        int m = mat[0].length;

        int ans = 0;

        for(int i=0 ; i<n ; i++) {
            //primary diagonal
            ans += mat[i][i];

            //secondary diagonal
            int j = n-1-i;
            if( i != j) {
                ans += mat[i][j];
            }
        }
        return ans;
    }
}
