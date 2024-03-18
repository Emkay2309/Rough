package Arrays.TwoDArray;


import java.util.*;

//        Give a nXn matrix, a rover is placed at first cell of the matrix i.e. (0,0). Also a list of commands is provided in the form of list.
//        Commands include values from following set: ["LEFT","RIGHT","UP","DOWN"]. You need to find position of rover after last command is executed on nXn matrix.
//        Rover must not cross the boundaries of given matrix. If command results in position outside the boundaries of matrix then rover must stay at current position.
public class RoverPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;

        String [] mov = {"left" , "right" , "right" , "down" , "left" , "down"};
        int [] ans = solve(n , mov);
        System.out.println(Arrays.toString(ans) );
    }
    static int [] solve(int n , String [] mov)  {
        int [] ans = {0,0};

        int row = 0;
        int col = 0;

        for(int i=0 ; i<mov.length ; i++ )  {
            String movement = mov[i];

            if(movement == "left")  {
                int colChange = col-1;
                if(colChange < 0  ||  colChange >= n) {
                    colChange = col;
                }
                else {
                    col = colChange;
                }
            }
            else if(movement == "right")  {
                int colChange = col+1;
                if(colChange < 0  ||  colChange >= n) {
                    colChange = col;
                }
                else {
                    col = colChange;
                }
            }
            else if(movement == "down") {
                int rowChange = row+1;
                if(rowChange < 0  ||  rowChange >= n) {
                    rowChange = row;
                }
                else {
                    row = rowChange;
                }
            }
            else {
                int rowChange = row-1;
                if(rowChange < 0  ||  rowChange >= n) {
                    rowChange = row;
                }
                else {
                    row = rowChange;
                }
            }
        }
        ans[0] = row;
        ans[1] = col;

        return ans;
    }
}
