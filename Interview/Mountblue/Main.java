package Interview.Mountblue;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String str = "is2 Thi1s T4est 3a";

        String ans = rearrange(str);
        System.out.println(ans);
    }

    public static String rearrange(String s)  {
        String [] senten = s.split("\\ ");

        StringBuilder sb = new StringBuilder();
        HashMap<Integer,String> map = new HashMap<>();

        for(String w : senten)  {
            String check = "";
            int number = 0;

            int len = w.length();
            for(int i=0; i<len ; i++)  {
                char ch = w.charAt(i);
                if(!Character.isDigit(ch) ) {
                    check += ch;
                }
                else {
                    number = ch;
                }
            }
            map.put(((int)number - '0') , check);
            System.out.println(((int)number  - '0') + " , " + check);
        }

        String ans = "";
        for(int i=1 ; i<=map.size(); i++) {
            String val = map.get(i);
            ans += val;
            if(i != map.size()) {
                ans += " ";
            }
        }
        return ans;
    }
}

