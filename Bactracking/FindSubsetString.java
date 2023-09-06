package Bactracking;

public class FindSubsetString {
    public static void main(String[] args) {
        String s = "abc";
        findSubsets(s,"",0);
    }
    public static void findSubsets(String s , String ans , int i) {
        //base case
        if(i==s.length()) {
            System.out.print("["+ ans + "],");
            return;
        }
        //recursion
        //yes choice
        findSubsets(s , ans+s.charAt(i) , i+1);

        //no choice
        findSubsets(s , ans ,i+1);
    }
}
