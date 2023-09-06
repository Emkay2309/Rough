public class GP {
    public static void main(String[] args) {
        System.out.println(GP(4));
    }
    public static double GP(int N) {
        return helper(N,0,0);
    }

    private static double helper(int n, double sum,int i) {
        if(n==i-1) {
            return sum;
        }
        sum = sum + (1/(Math.pow(2,i)));
        return helper(n,sum,i+1);
    }
}