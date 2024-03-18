package Arrays.TwoDArray;

public class RotateMatrix {
    public static void main(String[] args) {
        int [] [] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        transposeMatrix(mat);
        printMat(mat);
        System.out.println("-------------");
        rotateMatrix(mat);
        printMat(mat);
    }

    static  void transposeMatrix(int [][] mat)  {
        int n = mat.length;
        int m = mat[0].length;

        for(int i=0 ; i<n ; i++)  {
            for(int j=i ; j<m ; j++)  {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    static  void rotateMatrix(int [][] mat)  {
        int n = mat.length;
        int m = mat[0].length;

        for(int [] a : mat)  {
            rotateArray(a);
        }
    }

    static  void rotateArray (int [] arr )  {
        int n = arr.length;

        int i = 0 , j = n-1;

        while( i < j)  {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    static void printMat (int [][]mat)  {
        int n = mat.length;
        int m = mat[0].length;

        for(int i=0; i<n ; i++)  {
            for(int j=0 ; j<m ; j++) {
                System.out.print(mat[i][j] + " , ");
            }
            System.out.println();
        }
    }
}
