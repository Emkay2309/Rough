package Hashing;

import java.util.HashSet;

public class CheckSubarraySumzero {
    public static void main(String[] args) {
        int A [] = {2,2,1,-3,4,3,1,2,-3,2};

        System.out.println(solve(A));
    }

    private static boolean solve(int[] a) {
        for(int i=1 ; i<a.length ; i++) {
            a[i] += a[i-1];
            if(a[i]==0) {
                return true;
            }
        }

        HashSet <Integer> hs = new HashSet <Integer>();
        for(int i=0 ; i<a.length ; i++) {
            hs.add(a[i]);
        }
        if(hs.size() < a.length) {
            return true;
        }
        return false;
    }
}
