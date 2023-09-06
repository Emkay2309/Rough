package Stacks;

import java.util.Stack;
public class MaximumAreaHistogram {
    public static void main(String[] args) {
        int [] A = {2,1,5,6,2,3};
        System.out.println(maxArea(A));
    }
    public static int maxArea(int[] a) {
        int max = 0;
        int [] msl = new int [a.length];
        int [] msr = new int [a.length];

        //next Smallest left
        Stack<Integer> s = new Stack<>();

        for(int i=0 ; i<a.length ; i++) {
            while(!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                msl[i] = -1;
            }
            else {
                msl[i] = s.peek();
            }
            s.push(i);
        }

        //next smallest right
        s = new Stack<>();

        for(int i=msr.length-1 ; i>=0 ; i--) {

            while(!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                msr[i] = a.length;
            }
            else {
                msr[i] = s.peek();
            }
            s.push(i);
        }

        //area
        for(int i=0 ; i<a.length ; i++) {
            int width = msr[i]-msl[i]-1;
            int height = a[i];
            int area = width*height;
            max = Math.max(area,max);
        }
        return max;
    }
}

//  1 2 3 4 5
//  3 2 1 2 1
//  2 0 2 2 4
