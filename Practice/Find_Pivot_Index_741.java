package Practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Find_Pivot_Index_741 {
    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};
        System.out.println(BruteForce(nums));
    }

    private static int BruteForce(int [] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0 ; i<n ; i++) {
            if(hm.containsKey(nums[i])) {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else {
                hm.put(nums[i],1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<n ; i++) {
            if(hm.get(nums[i])==2) {
                ans.add(nums[i]);
                hm.put(nums[i],hm.get(nums[i])-1);
            }
        }

        for(int i=0 ; i<ans.size() ; i++) {
            System.out.print(ans.get(i)+" ");
        }
        return -1;
    }
}
