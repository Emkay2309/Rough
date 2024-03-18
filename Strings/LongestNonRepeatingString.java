package Strings;

public class LongestNonRepeatingString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(solve(s));
    }
    static  int solve(String str) {
        int n = str.length();
        int [] freq = new int [128];

        int ans = 0;

        int left = 0;
        int right = 0;

        while(right < n) {
            int addIndex = str.charAt(right);
            freq[addIndex]++;

            if(freq[addIndex] == 1)  {
                int len = right - left + 1;
                ans = Math.max(ans , len);
            }
            else {
                while(freq[addIndex] == 2) {
                    int removeIndex = str.charAt(left);
                    freq[removeIndex]--;
                    left++;
                }
            }
            right++;
        }
        return ans;
    }
}
