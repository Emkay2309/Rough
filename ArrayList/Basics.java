package ArrayList;
import java.util.*;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        //adding values  TC:O(1)
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        System.out.println(ans);

        ans.add(4,5);
        System.out.println(ans);

        //get values TC:O(1)
        int ele = ans.get(2);
        System.out.println(ele);

        //remove element TC:O(N)
        ans.remove(2);
        System.out.println(ans);

        //set element TC:O(N)
        ans.set(2,3);
        System.out.println(ans);

        //contains element TC:O(N)
        System.out.println(ans.contains(1));

        //size of arraylist
        System.out.println(ans.size());

        //print reverse of an arraylist
        int n = ans.size();

        for(int i=n-1 ; i>=0 ; i--) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();

        //find maximum in arraylist
        int max = Integer.MIN_VALUE;


        for(int i=0 ; i<n ; i++) {
            if(ans.get(i)>max) {
                max = ans.get(i);
            }
        }
        System.out.println(max);

        //swap 2 numbers
        System.out.println("previous araylist :" + ans);

        int index1 = 0;
        int index2 = 3;

        int temp = ans.get(index1);
        ans.set(index1 , ans.get(index2));
        ans.set(index2 , temp);

        System.out.println("current arraylist :" + ans);
    }
}
