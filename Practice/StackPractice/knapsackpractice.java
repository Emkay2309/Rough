package Practice.StackPractice;

public class knapsackpractice {
    public static void main(String[] args) {
        int [] val = {100,60,120,50};
        int [] wt = {20,10,30,40};
        int i = 0;
        int cap = 50;
        System.out.println(solve( val , wt , i , cap));
    }
    private  static int solve( int [] val  , int [] wt , int i , int cap) {
        if(i==val.length || cap == 0) return 0;
        if(cap >= wt[i]) {
            int ans1 = val[i] + solve(val , wt , i+1 , cap-wt[i]);
            int ans2 = solve(val,wt,i+1,cap);
            return Math.max(ans1 , ans2);
        }
        return solve(val,wt,i+1,cap);
    }
}
