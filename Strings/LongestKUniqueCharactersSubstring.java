package Strings;

import  java.util.*;
public class LongestKUniqueCharactersSubstring {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int ans = longestkSubstr(s , 3);
        System.out.println(ans);
    }
    public static int longestkSubstr(String s, int k) {
        int n = s.length();
        Map<Character , Integer> map = new HashMap<>();

        if(n < k) {
            return -1;
        }

        int ans = 0;
        int left = 0;

        for(int right = 0 ; right < n ; right++) {
            char currChar = s.charAt(right);

            map.put(currChar , map.getOrDefault(currChar , 0)+1);

            if(map.size() > k) {
                char removeChar = s.charAt(left);

                while(map.get(removeChar) > 0)  {                   //while(map.size() > k) {     //
                    char currRemoveChar = s.charAt(left);
                    map.put(currRemoveChar , map.get(currRemoveChar)-1);
                    left++;

                    if(map.size() < k) {
                        break;
                    }

                    if(map.get(currRemoveChar) == 0) {
                        map.remove(currRemoveChar);
                        break;
                    }
                }
            }
            ans = Math.max(ans , right-left+1);
        }
        return ans;
    }
}
