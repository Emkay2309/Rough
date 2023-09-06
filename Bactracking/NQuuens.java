package Bactracking;

public class NQuuens {
    public static void main(String[] args) {
        int n= 2;
        char board[] [] = new char [n][n];
        //initialize

        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ;j++) {
                board [i][j]= '.';
            }
        }
        Queens(0,board);
    }
    public static void Queens(int n,char [] [] board) {
        //base case
        if(n==board.length) {
            printBoard(board,n);
            return;
        }

        //colummn loop
        for(int i=0 ; i<board.length ; i++) {
            board[n][i] = 'Q';
            Queens(n+1,board);//recursion
            board[n][i]='.';//backtracking
        }
    }

    public static void printBoard(char[][] board,int n) {
        System.out.println("----------chess board-------");
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ;j++) {
                System.out.print(board [i][j]+" ");
            }
            System.out.println();
        }
    }
}
