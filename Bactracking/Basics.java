package Bactracking;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        int K = 3;
        int num = 0;
        int count = 0;
        ArrayList <Integer> ans = new ArrayList<>();
        printPattern( num ,  count ,  K , ans );
        for(int i=0 ; i<ans.size() ; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
    public static void printPattern(int num , int count , int k , ArrayList <Integer>  ans ) {
        if(count == k) {
            ans.add(num);
            return;
        }
        printPattern( num*10+1 , count+1 , k , ans);
        printPattern(num*10+2 , count+1 , k , ans);
    }
}
