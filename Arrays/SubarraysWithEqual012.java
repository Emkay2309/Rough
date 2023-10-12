package Arrays;

import java.util.HashMap;
public class SubarraysWithEqual012 {
    public static int countSubarraysWithEqual012(int[] arr) {
        int count = 0;
        int c0 = 0 , c1 = 0 , c2 = 0;

        HashMap<String , Integer> map = new HashMap<>();
        map.put( "0*0" , 1);

        for(int i=0 ; i<arr.length ; i++)  {
            c0 += (arr[i] == 0) ? 1 : 0;
            c1 += (arr[i] == 1) ? 1 : 0;
            c2 += (arr[i] == 2) ? 1 : 0;

            String key = ( c0-c1) + "*" + (c0-c2) ;
            count += map.getOrDefault(key , 0);
            map.put(key , map.getOrDefault(key , 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 2, 1, 0};
        int result = countSubarraysWithEqual012(arr);
        System.out.println("Number of subarrays with equal 0's, 1's, and 2's: " + result);
    }
}




