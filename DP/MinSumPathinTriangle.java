package DP;

public class MinSumPathinTriangle {
    public static void main(String[] args) {
        int [] [] A = {
                   {2},
                  {3,4},
                 {6,5,7},
                {4,1,8,3}
        };

        int sum = A[0][0];

        int j = 0;


        for(int i=0 ; i<A.length-1 ; i++) {

            int curr = A[i][j];

            if(A[i+1][j] < A[i+1][j+1] ) {
                sum += A[i+1][j];
            }
            else {
                sum += A[i+1][j+1];
                j += 1;
            }
        }
        System.out.println(sum);
    }
}
