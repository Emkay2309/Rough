package Practice.Design.FactoryPattern;


import java.util.Arrays;

/*
        An array contains both positive and negative numbers in random order.
        Rearrange the array elements so that all negative numbers appear before all positive numbers.

        Examples :

        Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
        Output: -12 -13 -5 -7 -3 -6 11 6 5

 */
public class MoveAllNegative {
    public static void main(String[] args) {
        int [] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        solve(arr);
    }
    private static  void solve(int [] arr)  {
        int n = arr.length;

        int count = 0;

        for(int i=0 ; i<n ; i++)  {
            if(arr[i] < 0 )  {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
