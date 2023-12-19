package Arrays;

public class MinimumSwaps {
    public static void main(String[] args) {
        int [] A = {1,12,10,3,14,10,5};
        int B = 8;
        System.out.println(solve(A,B));
    }
    public static int solve(int [] A, int B) {

        int c=0;
        for (int j : A) {
            if (j <= B) {
                c++;
            }
        }
        int temp=0;
        for(int i=0 ; i<c ; i++) {
            if(A[i] <= B) {
                temp++;
            }
        }
        int ans = c-temp;

        for(int i=c ; i<A.length ; i++) {
            if(A[i]<=B) {
                temp++;
            }
            if(A[i-c]<=B) {
                temp--;
            }
            ans = Math.min(ans , c-temp);
        }
        return ans;
    }
}
