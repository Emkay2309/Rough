package Contest;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
    public static String solve(int n) {
            if(n == 1) {
                return "1 1 1";
            }
            return 	Integer.toString(n) + " " + solve(n-1) + " " +  Integer.toString(n) + " " + solve(n-1) + " " + Integer.toString(n) ;
    }
}

