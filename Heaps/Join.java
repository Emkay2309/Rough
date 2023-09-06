package Heaps;
import java.util.*;

public class Join {
    public static void main(String[] args) {
        int [] A = {36,26,22,24};
        System.out.println(solve(A));
    }
    public static long solve(int [] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0 ; i<A.length ; i++){
            pq.add(A[i]);
        }
        long total = 0;
        while(pq.size() > 2) {
            long val1 = pq.poll();
            long val2 = pq.poll();

            long sum = val1+val2;
            total += sum;
        }
        long val1 = pq.poll();
        long val2 = pq.poll();

        long sum = val1+val2;

        return 2*(total+sum);
    }
}
