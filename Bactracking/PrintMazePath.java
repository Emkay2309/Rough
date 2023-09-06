package Bactracking;

public class PrintMazePath {
    public static void main(String[] args) {
        int A = 2;
        int B = 2;

        printPath(1 , 1 , A , B , "");
    }
    public static void printPath( int startRow , int startCol , int endRow , int endCol , String path) {

        if(startRow > endRow || startCol > endCol) {
            return;
        }
        if(startRow == endRow && startCol == endCol) {
            System.out.println(path);
            return;
        }

        printPath( startRow+1 , startCol , endRow , endCol , path+"v");
        printPath(startRow , startCol+1 , endRow , endCol , path+"h");
    }
}
