package Practice;
import java.util.*;
public class KnapSack {
    public static void main(String[] args) {
        int [] val = {60,100,120};
        int [] wt = {10,20,30};
        int capacity = 50;

        int [] dp = new int [val.length];
        Arrays.fill(dp , -1);

        System.out.println(BoundedKnapSack(val,wt,capacity, 0 , dp));
    }
    static int BoundedKnapSack(int [] val , int [] wt , int cap , int index,int [] dp)  {
        if(cap <= 0 || index >= val.length) {
            return 0;
        }
        if(dp[index] != -1) {
            return dp[index];
        }

        int pick = val[index] + BoundedKnapSack(val , wt , cap-wt[index] , index+1 , dp);
        int not_pick = BoundedKnapSack(val , wt , cap , index+1 ,dp);

        if( cap < wt[index] ) {
            dp[index] = not_pick;
            return not_pick;
        }
        else {
            dp[index] = Math.max(pick , not_pick);
            return Math.max(pick , not_pick);
        }
    }
}
