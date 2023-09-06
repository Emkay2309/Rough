package Greedy_Algorithmn;
import java.util.*;
public class Fractional_Knapsack {
    public static void main(String[] args) {
        int [] value = {60,100,120};
        int [] weight = {10,20,30};
        int w =50;

        System.out.println(solve(value,weight,w));
    }
    public static int solve(int [] A , int [] B,int w)  {
        int ans = 0;
        int capacity = w;
        double [] [] ratio = new double [A.length][2];
        //0th col == index , 1st col = ratio

        for(int i=0 ; i<A.length ; i++) {
            ratio[i][0] = i;
            ratio[i][1] = A[i]/(double)B[i];
        }

        //ascending order sort
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));

        for(int i=ratio.length-1 ; i>=0 ; i--) {
            int index = (int)ratio[i][0];
            if(capacity >= B[index]) { //include full item
                ans += A[index];
                capacity -= B[index];
            }
            else {
                ans += (ratio[i][1] * capacity);
                break;
            }
        }
        return ans;
    }
}
