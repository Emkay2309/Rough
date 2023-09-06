package DP;

public class Min_Squares {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(findmin(4));
    }

    public static int findmin (int n ) {
        if(n==0 || n==1) return n;
        int min_ans = Integer.MAX_VALUE;
        int i=1;
        while( (n - (i*i) ) >= 0 ) {
            int ans = findmin(n - (i*i));
            min_ans = Math.min(ans+1 , min_ans);
            i++;
        }
        return min_ans;
    }
}
