package Hashing;

import java.util.*;

public class Frequencyofelementquery {
    public static void main(String[] args) {
        int [] A = {2, 5, 9, 2, 8};
        int [] B = {3, 2};
        System.out.println(Arrays.toString(solve(A, B)));
    }
    public static int[] solve(int[] A, int[] B) {
        int ans []  = new int [B.length];

        HashMap <Integer , Integer > hm = new HashMap<>();

        for(int i=0 ; i<A.length ; i++) {
            if(hm.containsKey(A[i])) {
                // hm.put(A[i],hm.get(A[i])+1);
                int c = hm.get(A[i]);
                hm.put(A[i],c+1);
            }
            else {
                hm.put(A[i],1);
            }
        }

        //answer query
        for(int i=0 ; i<B.length ; i++) {
            if(hm.containsKey(B[i])) {
                ans[i] = hm.get(B[i]);
            }
        }
        return ans;
    }
}
