package Strings;


import java.util.*;
public class RemoveNumbers {
    public static void main(String[] args) {
        String str =  "App5les are1 go2od fo4r hea3lth";
        String [] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));

        System.out.println(solve(str));
    }

    public static String solve(String str) {
        String [] s = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<s.length ; i++) {
            String curr = s[i];

            int j = 0;
            while(j < curr.length())  {
                char c = curr.charAt(j);

                if(!Character.isDigit(c) ) {
                    sb.append(c);
                }
                j++;
            }
            if(i != str.length()-1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
