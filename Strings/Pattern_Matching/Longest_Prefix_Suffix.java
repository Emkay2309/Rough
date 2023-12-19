package Strings.Pattern_Matching;

import java.util.Arrays;

public class Longest_Prefix_Suffix {
    public static void main(String[] args) {
        String s = "aabacaaba";
        int [] lps = lps(s);
        System.out.println(Arrays.toString(lps));
        lps = solve(s);
        System.out.println(Arrays.toString(lps));
    }

    private static int[] lps(String s) {
        int n = s.length();
        int [] ans = new int [n];

        ans[0] = 0;

        for(int i=1 ; i<n ; i++) {
            int x = ans[i-1];
            while(s.charAt(x) != s.charAt(i)) {
                if(x == 0) {
                    x = -1;
                    break;
                }
                x = ans[x-1];
            }
            ans[i] = x+1;
        }
        return ans;
    }

    private static int [] solve(String s) {
        int n = s.length();

        int i = 1;
        int len = 0;
        int ans [] = new int [n];

        while( i < n)  {
            if(s.charAt(i) == s.charAt(len))  {
                len++;
                ans[i] = len;
                i++;
            }
            else {
                if(len != 0)  {
                    len = ans[len-1];
                }
                else {
                    ans[i] = 0;
                    i++;
                }
            }
        }
        return ans;
    }



}
