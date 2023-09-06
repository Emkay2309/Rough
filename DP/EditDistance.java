package DP;
import java.util.*;

public class EditDistance {
    public static void main(String[] args) {
        String s1 = "intention";
        String s2 = "execution";

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[s1.length()][s2.length()];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }

        Integer [] [] mem = new Integer [n+1][m+1];

        for(int i=0 ; i<=n ; i++) {
            for(int j=0 ; j<=m ; j++) {
                if (i == 0) {
                    mem[i][j] = j;
                }
                if (j == 0) {
                    mem[i][j] = i;
                }
            }
        }


        System.out.println("Tabulation : " + Tabulation(s1 , s2));
        System.out.println("Recursion : " + recursion(s1 , s2 , n-1 , m-1));
        System.out.println("Memoization : " + Memoization(s1 , s2 , n-1 , m-1 , mem));
        System.out.println("Memoization from 0 : " + minDistance(0,0,s1,s2,dp));


    }
    public static int Memoization ( String s1 , String s2 , int n , int m , Integer [] [] mem) {

        if(n < 0 && m < 0 ) return 0;

        if(n < 0 ) return mem[n][m] = m+1;
        if(m < 0 ) return mem[n][m] = n+1;

        if(mem[n][m] != null) {
            return mem[n][m];
        }

        if(s1.charAt(n) == s2.charAt(m)) {
            mem[n][m] =  Memoization(s1, s2 , n-1 , m-1 , mem);
        }
        else {
            int add = Memoization(s1, s2 , n , m-1, mem) + 1 ;
            int delete = Memoization(s1, s2 , n , m-1, mem) + 1 ;
            int replace = Memoization(s1, s2 , n , m-1, mem) + 1 ;

            mem[n][m] = Math.min( add , Math.min(delete ,replace));

        }
        return mem[n][m] ;
    }
    public  static int minDistance(int ind1,int ind2,String word1,String word2,int[][] dp){

        if(ind1 > word1.length() - 1){
            //think i1 went to end but there is still i2 left then we have to make operation like insertion
            return word2.length() - ind2;
        }

        if(ind2 > word2.length() - 1){
            //think i2 went to end but there is still i1 left then we have to make operation like deletion
            return word1.length() - ind1;
        }
        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }
        //we have to make word1 to word2
        //if it is already matching
        if(word1.charAt(ind1) == word2.charAt(ind2) ){
            return dp[ind1][ind2] = minDistance(ind1+1,ind2+1,word1,word2,dp);
        }else{
            //if we are deleting some element
            int a = 1 + minDistance(ind1+1,ind2,word1,word2,dp);

            //if we are rplacing the element
            int b = 1 + minDistance(ind1+1,ind2+1,word1,word2,dp);

            //if we are inserting the element
            int c = 1 +minDistance(ind1,ind2+1,word1,word2,dp);


            return dp[ind1][ind2] = Math.min(a,Math.min(b,c));
        }

    }
    public static int recursion ( String s1 , String s2 , int n , int m ) {

        if(n < 0 && m < 0 ) return 0;

        if(n < 0 ) return m+1;
        if(m < 0 ) return n+1;

        if(s1.charAt(n) == s2.charAt(m)) {
            return recursion(s1, s2 , n-1 , m-1);
        }
        else {
            return Math.min( recursion(s1, s2 , n-1 , m-1) , Math.min(recursion(s1, s2 , n-1 , m),recursion(s1, s2 , n , m-1))) + 1;
        }
    }
    public static int Tabulation(String s1 , String s2) {
        int n = s1.length();
        int m = s2.length();

        int [][] dp = new int [n+1] [m+1];

        for(int i=0 ; i<=n ; i++) {
            for(int j=0 ; j<=m ; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        for(int i=1 ; i<=n ; i++) {
            for(int j=1 ; j<=m ; j++) {
                //same
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }
                //different
                else {
                    dp[i][j] = Math.min( dp[i-1][j-1] , Math.min(dp[i-1][j] ,dp[i][j-1] ) ) + 1;
                }
            }
        }
        return dp[n][m];
    }
}
