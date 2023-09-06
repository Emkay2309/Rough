package Greedy_Algorithmn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Indian_Coins {
    public static void main(String[] args) {
        Integer den [] = {1,2,5,10,20,50,100,500,2000};
        int total = 590;
        System.out.println(solve(den,total));
    }
    public static int solve(Integer [] A,int total) {
        int count =0;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(A , Comparator.reverseOrder());
        for(int i=0 ; i<A.length ; i++) {
            if(A[i] <= total) {

                while(A[i] <= total) {
                    count++;
                    total -= A[i];
                    ans.add(A[i]);
                }
            }
        }
        return count;
    }
}
