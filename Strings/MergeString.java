package Strings;

public class MergeString {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "forgeeks";

        System.out.println(solve(s1 , s2));
    }
    static String solve(String s1 , String s2)  {
        StringBuilder sb = new StringBuilder();

        int n = s1.length();
        int m = s2.length();

        int i=0 , j=0;

        while(i < n   &&  j < m)  {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);

            sb.append(c1);
            sb.append(c2);

            i++;
            j++;
        }
        if(j < m) {
            sb.append(s2.substring(j));
        }
        if(i < n) {
            sb.append(s1.substring(i));
        }
        return sb.toString();
    }
}
//gfeoerkgseeks
//gfeoerkgseeks
