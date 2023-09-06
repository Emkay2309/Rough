package Bactracking;

public class XpowerN {
    public static void main(String[] args) {
        int X = 2;
        int N = 10;
        System.out.println(power(X,N));
    }
    private static int power(int x, int n) {
        if(n == 0) return 1;

        int halfPower = power(x , n/2) * power(x,n/2);
        if(n % 2 != 0) {
            halfPower = x * halfPower;
        }
        return halfPower;
    }
}
