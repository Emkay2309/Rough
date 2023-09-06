package Bactracking;

import java.util.ArrayList;

public class FindPermutation {
    public static void main(String[] args) {
        String S = "abc";
        Permutation(S,"");
    }

    public static void Permutation(String s , String ans) {
        //base case
        if(s.length() == 0) {
            System.out.print(ans +",");
            return;
        }
        //recursion
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            String newS = s.substring(0,i) + s.substring(i+1);
            Permutation(newS, ans+curr);
        }
    }
}
