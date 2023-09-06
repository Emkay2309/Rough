package DP;

public class MCM {
    public static void main(String[] args) {
        int arr [] = { 1,2,3,4,3};
        int n = arr.length;

        System.out.println("Minimum Cost : " + solve(arr, 1 , n-1));
        System.out.println("Minimum Cost : " +  scal(arr , 1 , n-1));

    }
    public static int solve( int [] A , int start , int end) {
        if(start == end) {
            return  0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k=start ; k<end ; k++) {
            int cost1 = solve(A , start , k);
            int cost2 = solve(A , k+1 , end );
            int cost3 = A[start-1] * A[k] * A[end];
            int totalcost = cost1 + cost2 + cost3;
            ans = Math.min( ans , totalcost);
        }
        return ans;
    }
    public static int scal( int [] A , int i , int j) {
        if( i == j ) return 0;

        int fac = j-i;
        int ans = Integer.MAX_VALUE;

        for(int k=0 ; k<fac ; k++) {
            int o1 = scal( A , i , i+k );
            int o2 = scal( A , i+k+1 , j );
            int res = A[i-1] * A[i+k] * A[j];
            ans = Math.min( ans , o1+o2+res);
        }
        return ans;
    }
}
