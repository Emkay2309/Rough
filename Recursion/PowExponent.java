package Recursion;

public class PowExponent {
    public static void main(String[] args) {
        int n = 4;
        int a = 5;

        System.out.println(power(a,n));
    }
    public  static int power(int a , int n ) {
        if(n==1) {
            return a;
        }
        if(n%2==1) {
            return power(a,n/2) * power(a,n/2) * a;
        }
        else {
            return power(a,n/2) * power(a,n/2);
        }
    }
}
