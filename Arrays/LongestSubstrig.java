package Arrays;

import java.util.HashSet;

public class LongestSubstrig {
    public static void main(String[] args) {
        String str = "abcdefghij";
        System.out.println("Longest substring : " +solve(str));
    }
    public static int solve(String str) {
        int n = str.length();
        int ans = 0;
        int len = 0;

        int left = 0;

        HashSet<Character> set = new HashSet<>();

        for(int right=0 ; right<n ; right++)  {
            char addch = str.charAt(right);

            if(set.contains(addch) == false) {  // abcabcd
                set.add(addch);
            }
            else {
                char removech = str.charAt(left);
                while(set.contains(addch)) {
                    set.remove(str.charAt(left));
                    left++;
                }
            }
            len = right-left+1;
            ans = Math.max(len, ans);
        }
        return ans;
    }
}


//Explanation: The longest substring without any repeating characters is "ab".
//        Input: String="abccde"
//        Output: 3
//        Explanation: Longest substrings without any repeating characters are "abc" & "cde".