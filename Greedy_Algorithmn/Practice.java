package Greedy_Algorithmn;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Integer [] A = {1,2,5,10,20,50,100,500,2000};
        int total = 590;

        Arrays.sort(A , Comparator.reverseOrder());
        int count = 0;

        for(int i=0 ; i<A.length ; i++) {
            if( A[i] <= total) {
                while(A[i] <= total) {
                    count++;
                    total -= A[i];
                }
            }
        }
        System.out.println(count);

    }
}
