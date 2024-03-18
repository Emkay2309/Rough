package Strings;

public class RepeatFront {
    public static void main(String[] args) {
        String str = "Chocolate";
        int n = 4;
        System.out.println(solve(str , n));
        System.out.println(solve1(str,n));
    }
    public static  String  solve(String str , int n) {
        String ans = "";
        int len = str.length();

        for (int i = n; i >= 1; i--) {
            ans += str.substring(0, i);
        }
        return ans;
    }
    public static String solve1(String s , int n)  {
        if(n < 0) {
            return "";
        }
        return s.substring(0,n) + solve1(s , n-1);
    }

}
