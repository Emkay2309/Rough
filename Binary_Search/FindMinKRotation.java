package Binary_Search;

public class FindMinKRotation {
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,1,2};
        System.out.println(findKRotation(arr));
    }

    public static int findKRotation(int []arr){
        // Write your code here.

        int ans = Integer.MAX_VALUE;
        int index = -1;

        int low = 0;
        int high = arr.length-1;

        while( low <= high) {

            //Calculate Mid
            int mid = (low + high)/2;

            //Check what part is sorted

            if(arr[low] <= arr[high] ){

                if(arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }
                return index;
            }


            //Check if left part is sorted
            if( arr[low] <= arr[mid]) {
                //updating ans
                if(arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }


                low = mid+1;
            }
            //else right is sorted
            else if(arr[mid] <= arr[high]){
                //update ans
                if(arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }

                high = mid-1;
            }
        }
        return index;
    }
}
