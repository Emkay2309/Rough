package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        String A = "A";
        String B = "B";
        String C = "C";
        TOH(n , A, C, B);
    }
    public static void TOH(int n, String a, String c, String b) {
        if(n==0) return;
        TOH(n-1 , a , b , c);
        System.out.println("Move : " + n + " " + a + " "+ c);
        TOH(n-1, b, c, a);
    }
//    public static int [] [] TOH(int n, String a, String c, String b) {
//        int [] [] ans = new ans [n][3];
//        if(n==0) return ans;
//
//        TOH(n-1 , a , b , c);
//        ans[n][0] = n;
//        ans[n][1] = [a];
//        ans [n][2] = [c];
//        System.out.println("Move : " + n + " " + a + " "+ c);
//        TOH(n-1, b, c, a);
//    }
}
