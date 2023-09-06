class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isStringPalindrome("abba"));
    }
    public static boolean isStringPalindrome(String input) {

        return helper(input,0,input.length()-1);

    }
    public static  boolean helper(String s , int i , int j) {
        if(i>j) {
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)) {
            return false;
        }
        return helper(s , i+1 , j-1);
    }

}