package Strings;

public class PrefixAgain {
    public static void main(String[] args) {
        System.out.println(prefix("abXYabc", 1));
        System.out.println(prefix("abXYabc", 2) );
        System.out.println(prefix("abXYabc", 3) );
    }
    public static boolean prefix(String str , int n)  {
        int len = str.length();

        String check = str.substring(0,n);
        for(int i=n ; i<=len-n ; i++)  {
            if(str.substring(i , i+n).equals(check)) {
                return true;
            }
        }
        return false;
    }
}
