package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class TargetSum {
    public static void main(String[] args) {
        int [] arr = {1,3,8,4,19,7,14};
        int target = 22;

        ArrayList<ArrayList<Integer>> ans =  solve(arr   , target);

        for(int i=0 ; i<ans.size() ; i++) {
            for(int j=0 ; j<ans.get(0).size() ; j++) {
                System.out.print(ans.get(i).get(j) + " , ");
            }
            System.out.println();
        }

    }
    static ArrayList<ArrayList<Integer>> solve(int [] arr , int t)  {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        HashMap<Integer ,Integer> map = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0 ; i<arr.length ; i++)  {
            int val = arr[i];
            int check = t-val;
            if(!map.containsKey(val)) {
                map.put(val , i);
            }
            temp = new ArrayList<>();
            if(map.containsKey(check)) {
                temp.add(map.get(check));
                temp.add(i);
                ans.add(temp);
            }
        }
        return ans;
    }
}
//  array , LinkedList ,   //   0 , 1 , 2 , , , , , 16   Node --> key , val , Next node address , hashcode