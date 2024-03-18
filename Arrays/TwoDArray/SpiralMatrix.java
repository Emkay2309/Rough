package Arrays.TwoDArray;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [] [] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        spiralMatrix(mat);
        String s = "Hello";
        String p = "Hellos";

        System.out.println(s.compareTo(p) > 1);
    }
    public static  void spiralMatrix (int [][]mat)  {
        int n = mat.length;
        int m = mat[0].length;

        int startRow = 0 , startCol = 0 , endRow = n-1 , endCol = m-1;

        while( startRow <= endRow  &&   startCol <= endCol) {

            //Top Boundary
            for(int j=startCol ; j<=endCol ; j++)  {
                System.out.print(mat[startRow][j] + " , ");
            }

            //Right Boundary
            for(int i = startRow+1 ; i <= endRow ; i++)  {
                System.out.print( mat[i][endCol] + " , ");
            }

            //Bottom Boundary
            for(int j = endCol-1 ; j >= startCol; j--)  {
                System.out.print(mat[endRow][j] + " , ");
            }

            //Left boundary
            for(int i = endRow-1 ; i >= startRow+1 ; i--) {
                if(startCol == endCol) {
                    return ;
                }
                System.out.print( mat[i][startCol] + " , ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    private static void printMat (int [][]mat)  {
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
