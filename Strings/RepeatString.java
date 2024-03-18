package Strings;

public class RepeatString {
    public static void main(String[] args) {
        int n = 3;
        String str = "Hello";
        System.out.println(solve(str , n));
    }
    public static  String solve(String s , int n ) {
        int len = s.length();
        String ans = "";

        for(int i=0 ; i<n ; i++)  {
            ans += s.substring(len - n);
        }
        return ans;
    }
}
