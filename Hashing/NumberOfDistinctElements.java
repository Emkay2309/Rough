package Hashing;

import java.util.*;

public class NumberOfDistinctElements {
    public static void main(String[] args) {
        int [] A = {1,2,3,3,3,3};
        System.out.println(solve(A));
    }
    private static int solve(int[] a) {
        HashSet <Integer > hs = new HashSet<>();

        for(int i=0 ; i<a.length ; i++) {
            hs.add(a[i]);
        }
        return hs.size();
    }
}
