package TwoD_Arrays;

public class Transpose {
    public static void main(String[] args) {
        int [] [] A = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };

        ConvertToTranspose(A);

        for(int i=0 ; i<A.length ; i++) {
            System.out.print("{ ");
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + ", ");
            }
            System.out.println("},");
        }
    }
    public static void ConvertToTranspose(int [] [] A) {
        int n = A.length;
        int m = A[0].length;

        for(int i=0 ; i<n ; i++) {
            for (int j = i+1; j < m; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }
}
