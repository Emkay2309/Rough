package Arrays;

public class Christmas_Tree {
    public static void main(String[] args) {
        int [] A = {1, 6, 4, 2, 6, 9};
        int [] B = {2, 5, 7, 3, 2, 7};

        System.out.println(solve(A,B));
    }
    public static int solve(int [] A , int [] B) {
        int n = A.length;
        int minCost = Integer.MAX_VALUE;

        for(int j=1 ; j<n-1 ; j++) {
            int midMin = B[j];

            //left Min
            int leftMin = Integer.MAX_VALUE;
            for(int i=j-1 ; i>=0 ; i--) {
                if(A[i] < A[j]) {
                    leftMin = Math.min(B[i] , leftMin);
                }
            }

            //right Min
            int rightMin = Integer.MAX_VALUE;
            for(int k=j+1 ; k<n ; k++) {
                if(A[j] < A[k]) {
                    rightMin = Math.min(B[k] , rightMin);
                }
            }

            if(rightMin != Integer.MAX_VALUE  && leftMin != Integer.MAX_VALUE ){
                int sum = leftMin + midMin + rightMin;
                minCost = Math.min(minCost,sum);
            }

        }
        if(minCost == Integer.MAX_VALUE) {
            return -1;
        }
        return minCost;
    }
}
