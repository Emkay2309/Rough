package Hashing;
import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int A [] = {100,3,4,1,2,7,99,98,5,16};
        System.out.println(solve(A));
    }
    public static int solve(int [] A) {
        HashMap <Integer , Boolean> hm = new HashMap<>();

        for(int i=0 ; i<A.length ; i++) {
            hm.put(A[i],true);
        }

        //traverse for special element
        for(int i=0 ; i<A.length ; i++) {
            if(hm.containsKey(A[i]-1) == false) {
                hm.put(A[i],false);
            }
        }
        //count length for special elements

        int maxCount = 1;

        for(int i=0 ; i<A.length ; i++) {
            if(hm.get(A[i])==false) {
               int count = 0;
                int a = A[i];
                while(hm.containsKey(a) == true) {
                    count++;
                    a = a+1;
                }
                if(count>maxCount) {
                    maxCount = count;
                }
            }
        }
        return maxCount;
    }
}
