package Strings;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcda";
        System.out.println(solve(s));
    }
    public static int solve(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;

        int [] check = new int [256];
        int ans = Integer.MIN_VALUE;

        while(right < n) {
            int index = s.charAt(right);
            check[index]++;

            if(check[index] == 1) {
                int len = right - left +1;
                ans = Math.max(ans , len);
                right++;
            }
            else {
                while(check[index] > 1) {
                    int indexLeft = s.charAt(left);
                    check[indexLeft]--;
                    left++;
                }
                right++;
            }
        }
        return ans;
    }
}
