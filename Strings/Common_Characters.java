package Strings;

import java.util.Arrays;
public class Common_Characters {
    public static void main(String[] args) {
        String s = "geeksforgeeks"  , p = "platformforgeeks";
        System.out.println(solve(s , p));
    }
    static  int solve(String s , String t)  {
        int n = s.length();
        int m = t.length();

        int ans = 0;

        int [] sFreq = new int [26];
        int [] tFreq = new int [26];

        for(int i=0 ; i<n ; i++)  {
            char ch = s.charAt(i);
            sFreq[ch - 'a']++;
        }

        for(int i=0 ; i<m ; i++)  {
            char ch = t.charAt(i);
            tFreq[ch - 'a']++;
        }

        for(int i=0 ; i<26 ; i++) {
            ans += (Math.min(sFreq[i] , tFreq[i]));
        }

        return ans;
    }
}
