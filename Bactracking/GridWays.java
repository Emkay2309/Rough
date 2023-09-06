package Bactracking;

public class GridWays {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(totalWays(0,0,n,m));
    }
    public static int totalWays(int i, int j,int N , int M) {
        if(i == N-1 && j == M-1) {
            return 1;
        }
        else if(i==N || j == M) {
            return 0;
        }
        int way1 = totalWays(i+1 , j , N , M);
        int way2 = totalWays(i , j+1 , N , M);

        return way1+way2;
    }
}
