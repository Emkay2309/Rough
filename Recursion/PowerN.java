package Recursion;

public class PowerN {
    public static void main(String[] args) {
        int N = 4;
        int a = 3;

        System.out.println(powerN(a,N));
    }
    static int powerN(int base , int n) {
        if( n == 0) {
            return 1;
        }
        if( n == 1) {
            return base;
        }
        int ans = powerN(base , n/2);
        if( n % 2 == 1) {
            return base * ans * ans;
        }
        else {
            return ans * ans;
        }
    }
}
