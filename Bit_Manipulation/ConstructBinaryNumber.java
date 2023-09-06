package Bit_Manipulation;

public class ConstructBinaryNumber {
    public static void main(String[] args) {
        int A = 3;
        int B = 2;
        System.out.println(solve(A,B));
    }
    public static int solve(int A , int B) {
        int len = A+B;   //5
        int num = 0;
        int i = len-1;   //4

        while( i >= B) {
            int val = (int)Math.pow(2,i); //16 , 8, 4
            num += val;
            i--;
        }

        return num;
    }
}
