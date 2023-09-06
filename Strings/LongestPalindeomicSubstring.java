package Strings;

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
}
