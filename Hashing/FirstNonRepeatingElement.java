package Hashing;

import java.util.*;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int A [] = {1,2,3,1,2,5};
        System.out.println(solve(A));
    }

    private static int solve(int[] a) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0 ; i<a.length ; i++) {
            if(hm.containsKey(a[i])) {
                hm.put(a[i],hm.get(a[i])+1);
            }
            else {
                hm.put(a[i],1);
            }
        }

        for(int i=0 ; i<a.length ; i++) {
            if(hm.get(a[i])==1) {
                return a[i];
            }
        }
        return -1;
    }
}
