package Arrays.subArrays;

public class CountingSubarrayEasy {
    public static void main(String[] args) {
        int [] A  = {1,11,2,3,15};
        int B = 10;
        System.out.println(solve(A , B));
        System.out.println(pfsolve(A , B));
    }
    //Approach 1 : Optimized
    public static int solve(int [] A , int B) {
        int n = A.length;
        int count = 0;
        for(int i=0 ; i<n ; i++) {
            int sum = 0;
            for(int j=i; j<n ; j++) {
                sum += A[j];
                if(sum < B) {
                    count++;
                }
            }
        }
        return count;
    }
    //Approach 2 : Prefix Sum
    public static int pfsolve(int [] A , int B) {
        int n = A.length;
        int count = 0;

        int [] pf = new int [n];
        pf[0] = A[0];
        for(int i=1 ; i<n ; i++) {
            pf[i] = A[i] + pf[i-1];
        }

        for(int i=0 ; i<n ; i++) {
            for(int j=i ; j<n ; j++) {    // 0   1  2  3
                int sum = 0;              // 1  2  3  4
                if(i == 0) {              // 1  3  6  10
                    sum = pf[j];
                }
                else {
                    sum  = pf[j]-pf[i-1];
                }
                if(sum < B) {
                    count++;
                }
            }
        }
        return count;
    }
}
