package DP;

public class EggDrop {
    public static void main(String[] args) {
        int n = 2;
        int k = 10;
        int [][] dp = new int [n+1][k+1];
        for(int i=0 ; i<=n ; i++) {
            for(int j=0 ; j<=k ; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(MinEggDrop(n,k , dp));
    }
    static  int MinEggDrop(int egg , int floor , int [][] dp)  {
        if(egg == 0 || floor == 0) {
            return 0;
        }

        if(egg == 1) {
            return floor;
        }
        if(floor == 1) {
            return 1;
        }

        if(dp[egg][floor] != -1) {
            return dp[egg][floor];
        }

        int ans = Integer.MAX_VALUE;
        for(int i=1 ; i<=floor ; i++) {
            int breaks = MinEggDrop(egg-1 , i-1 , dp);
            int notBreaks = MinEggDrop(egg , floor-i , dp);

            int higherFloor = Math.max(breaks,notBreaks);
            ans = Math.min(higherFloor,ans);
        }
        return dp[egg][floor] = ans+1;
    }
}
