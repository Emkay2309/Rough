package DP;

import java.util.Arrays;

public class StringConversion {
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

    }
}
