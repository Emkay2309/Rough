package DP;

public class KnapSack_0_1 {
    public static void main(String[] args) {
        int[] A = {15, 14 ,10 , 45 ,30 };
        int[] B = {2  ,5 ,  1,  3 , 4};
        int C = 7;
        int index = A.length;

        int[][] dp = new int [index + 1] [C+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length ; j++) {
                dp[i][j] = -1;
            }
        }

        int ans1 = fun(A,B,C,0);
        System.out.println("Recursion from 0 index: " + ans1);
        System.out.println();

        int ans = knapRecursion(A,B,C,index-1);
        System.out.println("Recursion from last index: " + ans);
        System.out.println();

        int ans2 = knap (A,B,C,dp,A.length);
        System.out.println("Memoization : " + ans2);
        System.out.println();

        int ans3 = knapsackTaulation(A,B,C);
        System.out.println("Taulation : " + ans3);



    }
    public static int knap( int [] A , int [] B , int C , int [] [] dp , int index) {

        if(C == 0 || index == 0) {
            return 0;
        }

        if(dp [index] [C] != -1) {
            return dp[C][index];
        }


        if( B[index-1] <= C) {
            //include
            int includeans = A[index-1] + knap(A , B , C-B[index-1] ,dp,index-1);

            //exclude
            int excludeans = knap(A , B , C ,dp,index-1);

            dp [index] [C] =  Math.max(excludeans , includeans);

            return dp [index] [C];
        }
        else { // not valid
            dp [index] [C] = knap(A , B , C ,dp,index-1);
            return dp [index] [C];
        }

    }
    public static int knapRecursion( int [] A , int [] B , int C , int index) {

        if(C == 0 || index == 0) {
            return 0;
        }

        if( B[index] <= C) { //valid
            //include
            int includeans = A[index] + knapRecursion(A , B , C-B[index] ,index-1);

            //exclude
            int excludeans = knapRecursion(A , B , C ,index-1);

            return Math.max(excludeans , includeans);
        }
        else { // not valid
            return knapRecursion(A , B , C ,index-1);
        }

    }
    public static  int knapsackTaulation(int [] val , int [] wt , int W) {
        int n = val.length;
        int dp [] [] = new int [n+1] [W+1];

        for(int i=0 ; i<dp.length ; i++) {
            dp[i][0] = 0;
        }

        for(int j=0 ; j<dp[0].length ; j++) {
            dp[0][j] = 0;
        }

        for(int i=1 ; i<n+1 ; i++) {
            for(int j=1 ; j<W+1 ; j++) {
                // ith item value and weight
                int v = val[i-1];
                int w = wt[i-1];

                if(w <= j) { //valid
                    int incProfit = v + dp[i-1][j-w];
                    int excProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit , excProfit);
                }
                else {  //invalid
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        System.out.println("DP Table for Tabulation");
        for(int i=0 ; i<dp.length ; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return dp[n][W];

    }
    public static int fun (int [] val , int [] wt , int C , int index) {
        if(index == val.length || C == 0) return 0;

        if( C >= wt[index]) {
            int pick = val[index] + fun( val , wt , C-wt[index] , index+1);
            int notpick = fun( val , wt , C , index+1);

            return Math.max(pick , notpick);
        }
        else {
            return fun( val , wt , C , index+1);
        }
    }
}
