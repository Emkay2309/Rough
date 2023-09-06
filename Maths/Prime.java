package Maths;
public class Prime {
    public static void main(String[] args) {
        int N1 = 35;
        int N2 = 25;

        System.out.println(gcd(N1,N2));
    }

    public static int gcd (int A , int B) {
        if(A==0) {
            return B;
        }
        if(A > B) {
            return gcd(B,A);
        }
        return gcd(B%A , A);
    }
}
