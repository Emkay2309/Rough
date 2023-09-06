package Greedy_Algorithmn;

import java.util.*;

public class Max_Length_Chain_Of_Pairs {
    public static void main(String[] args) {

        int [] [] pairs = {{5,24} , {39,60} , {5,28}, {27,40}, {50,90}};
        System.out.println(solve(pairs));;
    }
    public static int solve(int [] [] A) {

        Arrays.sort(A, Comparator.comparingDouble( o -> o[1]));
        int ans = 1;
        int chainEnd = A[0][1];

        for(int i=1 ; i<A.length ; i++) {
            if(A[i][0] > chainEnd) {
                ans++;
                chainEnd = A[i][1];
            }
        }
        return ans;
    }
}
