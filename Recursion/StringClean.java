package Recursion;

public class StringClean {
    public static void main(String[] args) {
        String str = "abbbcdd";
        System.out.println(clean(str));
    }
    static String clean(String str)  {
        if( str.length() <= 1)  {
            return str;
        }

        if(str.charAt(0) == str.charAt(1))  {
            return clean(str.substring(1));
        }
        return   str.charAt(0) + clean(str.substring(1));
    }
}
