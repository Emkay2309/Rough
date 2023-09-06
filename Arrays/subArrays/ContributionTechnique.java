package Arrays.subArrays;

public class ContributionTechnique {
    public static void main (String [] args) {
        int [] A = {4,-2,7,1};

        BruteForce(A);
        System.out.println(maxSum(A));
    }
    public static void BruteForce(int [] A) {
        int n = A.length;
        int total = 0;
        for(int i=0 ; i<n ; i++) {
            int occurnace = (n-i) * (i+1);
            total += A[i] * occurnace;
        }
        System.out.println(total);
    }

    public static int maxSum(int[] A) {
        int max = 0;
        int n = A.length;
        int k = 2;
        int sum = 0;

        for(int i=0 ; i<k ; i++) {
            sum += A[i];
        }

//        for(int i=k ; i<n ; i++) {
//            sum += A[i];
//            sum -= A[i-k];
//            max = Math.max(max , sum);
//        }
//        return max;
        int s=0 ;
        int e = k;
        while(e < n) {
            sum = sum + A[e] - A[s] ;
            max = Math.max(max , sum);
            s++;
            e++;
        }
        return max;
    }


}
