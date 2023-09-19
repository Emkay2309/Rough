package Arrays.subArrays;

import java.util.HashSet;

public class SubarraySumZero {
    public static void main(String[] args) {
        int [] arr = {3,2,5,-10,2,7};
        boolean ans = SumZeroNsq(arr);
        boolean ans1 = SumZero(arr);
        System.out.println(ans1);
        System.out.println(ans);
    }

    private static  boolean SumZero(int [] arr) {
        HashSet<Integer> set = new HashSet<>();

        int n = arr.length;
        int sum = 0;

        for(int i=0 ; i<n ; i++) {
            sum += arr[i];
            if(sum == 0 || arr[i] == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    private static boolean SumZeroNsq(int[] arr) {
        int n = arr.length;
        for(int i=0 ; i<n ; i++) {
            int sum = arr[i];
            if(sum == 0) {
                return true;
            }
            for(int j=i+1 ; j<n ; j++) {
                sum += arr[j];

                if(sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }

}
