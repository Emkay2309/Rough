package Practice.StackPractice;

public class longest_Palindromic_substring {
    public static void main(String[] args) {
        String s = "cbbd";

        int n = s.length();

        int ans = solve(s,n);
        System.out.println(ans);
    }
    public static int solve(String s , int n) {
        int max = 0;

        for(int i=0 ; i<n-1 ; i++) {
            String check = "";
            for(int j=i+1 ; j<n ; j++) {
                check = s.substring(i,j);
                if(checkpalindrome(check) == true) {
                    int len = j - i ;
                    max = Math.max(max, len);
                }
            }
        }
        return max;
    }

    public static boolean checkpalindrome(String check) {
        int i=0 ;
        int j = check.length()-1;

        while(i<j) {
            if(check.charAt(i) != check.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
