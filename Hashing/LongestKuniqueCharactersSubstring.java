package Hashing;

import java.io.CharArrayReader;
import java.util.HashMap;

public class LongestKuniqueCharactersSubstring {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        int ans = solve(s , k);
        System.out.println(ans);
    }

    private static int solve(String s, int k) {
        int ans = 0;
        int n = s.length();
        int left = 0;
        HashMap<Character , Integer> map = new HashMap<>();

        for(int right = 0 ;  right < n ; right++)   {
            char addch = s.charAt(right);
            map.put(addch , map.getOrDefault(addch , 0) + 1);
            if(map.size() > k)  {
                //start removing from map un-till  map size is within limit
                while( map.size() > k)  {
                    char subch = s.charAt(left);
                    map.put(subch , map.get(subch) -1);
                    left++;
                    if(map.get(subch) == 0) {
                        map.remove(subch);
                        break;
                    }
                }
            }
            ans = Math.max(ans , right-left+1);
        }
        return ans;
    }
}
