package Arrays.TwoDArray;

import java.util.HashSet;
import java.util.*;

public class ArraySubproblem {
    public static void main(String[] args) {
        int [] arr = {10 , 3,6,9};
        int ans = solve(arr);
        System.out.println(ans);
    }
    static  int solve(int [] arr)  {
        int len = arr[0];
        int n = len/2;

        HashSet<Integer> set = new HashSet<>();
        int [] [] mat = new int[n][2];

        for(int [] a : mat) {
            Arrays.fill(a , -1);
        }
        int ans = 0;

        for(int i=1 ; i<arr.length ; i++) {
            set.add(arr[i]);
        }

        for(int i=0 ; i<n ; i++) {

            int val1 = i*2+1;
            int val2 = i*2+2;

            if(set.contains(val1) == false)  {
                mat[i][0] = val1;
            }
            if(set.contains(val2) == false) {
                mat[i][1] = val2;
            }
        }

        for(int i=0 ; i<n ; i++) {
            int val1 = mat[i][0];
            int val2 = mat[i][1];

            System.out.println("[" + val1 + " ], [ " + val2 + " ]");
        }

        for(int i=0 ; i<n-1 ; i++) {

            int curr = mat[i][0];
            int currNext = mat[i][1];
            int next = mat[i+1][0];
            int nextNext = mat[i+1][1];

            if(curr != -1 && currNext != -1)  {
                ans++;
            }
            if(curr != -1 && next != -1)  {
                ans++;
            }

            if(nextNext != -1 && currNext != -1)  {
                ans++;
            }

        }

        return ans;
    }
}
