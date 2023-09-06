package Arrays.subArrays;

public class SubArraySUM {
    public static void main(String[] args) {
        int [] A = {2,8,-1,4};
        //findAllSum(A);
        //printSum(A);
        sumPrint(A);
    }
    //Brute Force Approach
    public static void findAllSum(int [] A) {
        int length = A.length;

        for(int start=0 ; start < length ; start++) {
            for(int end=start ; end<length ; end++) {
                int sum = 0;
                for(int k=start ; k<=end ; k++) {
                    sum += A[k];
                }
                System.out.println("sum for start "+ start  +" : " + sum);
            }
            System.out.println();
        }
    }

    //Prefix sum Approach
    public static void printSum(int [] A) {
        int n = A.length;
        int [] pf = new int [n];

        pf[0] = A[0];
        for(int i=1 ; i<n ; i++) {
            pf[i] = pf[i-1] + A[i];
        }

        for(int start=0 ; start < n ; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                if (start == 0) {
                    sum = pf[end];
                } else {
                    sum = pf[end] - pf[start];
                }
                System.out.println("sum for start "+ start  +" : " + sum);
            }
        }
    }
    //Optimized
    public static void sumPrint(int  [] A) {
        int n = A.length;
        for(int i=0 ; i<n ; i++) {
            int sum = 0;
            for(int j=i; j<n ; j++) {
                sum += A[j];
                System.out.println("sum for start " + i + " : " + sum);
            }
            System.out.println();
        }
    }
}
