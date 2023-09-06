package DP;

public class HouseRobbery {
    public static void main(String[] args) {
        int [] A = {6,10,4,5,2};

        int [] maxNonConsSum = new int [A.length];

        maxNonConsSum[0] = A[0];
        maxNonConsSum[1] = Math.max(A[0],A[1]);

        for(int i=2 ; i<A.length ; i++) {
            int f1 = A[i] + maxNonConsSum[i-2];
            int f2= maxNonConsSum[i-1];
            maxNonConsSum[i] = Math.max(f1 , f2);
        }
        System.out.println(maxNonConsSum[maxNonConsSum.length - 1]);
    }
}
