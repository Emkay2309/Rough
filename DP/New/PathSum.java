package DP.New;

public class PathSum {
    public static void main(String[] args) {
        int [][] A = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        int sum = 0;
        int min = Integer.MAX_VALUE;
        pathMemo(A , 0 , 0  , min , sum) ;
        System.out.println(min);
    }
    public static  void pathMemo(int [][] grid , int row , int col , int min , int sum)  {

        if(row == grid.length-1 && col == grid[0].length-1)  {
            min = Math.min(min , sum);
            return ;
        }

        if(row<0 || col <0 || row>=grid.length || col>=grid[0].length  )  {
           return ;
        }
        pathMemo(grid , row , col+1 , min , sum+grid[row][col]);
        pathMemo(grid , row+1 , col , min , sum+grid[row][col]);

        sum = sum - grid[row][col];

    }
}
