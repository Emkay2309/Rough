package Strings;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindeomicSubstring {
    public static void main(String[] args) {
        String s = "cddabcba";
        System.out.println(solve(s));
    }

    public static int solve(String s) {
        int ans = 0;
        int start = -1;
        int end = -1;

        for(int i=0 ; i<s.length(); i++) {
            int count = 0;

            //odd case
            int left = i-1;
            int right = i+1;
            while( left >= 0 && right < s.length()) {
                if( s.charAt(left) == s.charAt(right)) {
                    count++;
                    left--;
                    right++;
                }
                else {
                    break;
                }
            }
            int val = (2*count)+1;
            count = val;
            if(count > ans) {
                ans = count;
                start = left+1;
                end = right;
            }

            count = 0;
            //even case
            left = i;
            right = i+1;
            while( left >= 0 && right < s.length()) {
                if( s.charAt(left)==s.charAt(right)) {
                    count++;
                    left--;
                    right++;
                }
                else {
                    break;
                }
            }
            val = 2*count;
            count = val;
            if(count > ans) {
                ans = count;
                start = right+1;
                end = right;
            }

        }

        return ans;
    }

    public static class Isomorphic_Strings {
        public static void main(String[] args) {
            String s = "egg";
            String t = "add";

            System.out.println(solve(s,t));
        }
        static  boolean solve(String s , String t)  {
            int n = s.length();
            int m = t.length();

            if( n != m)  return false;

            Map<Character , Character> map1 = new HashMap<>();
            Map<Character , Boolean> map2 = new HashMap<>();

            for(int i=0 ; i<n ; i++)  {
                char ch1 = s.charAt(i);
                char ch2 = t.charAt(i);

                if(map1.containsKey(ch1))  {
                    if(map1.get(ch1) != ch2)  {
                        return false;
                    }
                }
                else {
                    if(map2.containsKey(ch2)) {
                        return false;
                    }
                    else {
                        map1.put(ch1 , ch2);
                        map2.put(ch2 , true);
                    }
                }
            }
            return true;
        }
    }
}
