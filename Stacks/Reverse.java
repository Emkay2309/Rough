package Stacks;

public class Reverse {
    public static void main(String[] args) {
        String s = "abcdefg";
        String ans = rev(s);
        System.out.println(ans);
    }
    private static  String rev(String str) {
        int s = 0;
        int e = str.length()-1;

        StringBuilder ans = new StringBuilder(str);

        while(s <= e)  {
            char start = str.charAt(s);
            char end  =  str.charAt(e);

            ans.setCharAt(s, end);
            ans.setCharAt(e , start);

            s++;
            e--;
        }
        return ans.toString();
    }
}
