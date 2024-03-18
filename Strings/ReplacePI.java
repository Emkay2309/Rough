package Strings;

public class ReplacePI {
    public static void main(String[] args) {
        String str = "xpipix";
        System.out.println(replace(str));
    }
    public  static  String replace(String s)  {
        if(s.length() <= 1)  {
            return s;
        }

        if(s.substring(0,2).equals("pi"))  {
            return "3.14" + replace(s.substring(2));
        }
        return s.charAt(0) + replace(s.substring(1));
    }
}
