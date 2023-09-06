package Arrays;

public class TwoDifference {
    public static void main(String[] args) {
        int [] A = {-5,3,7,8,12,18};
        int k = 6;
        System.out.println(checkDifference(A,k));
    }
    public static boolean checkDifference (int [] A,int k) {
        int n = A.length;
        int i=0 ;
        int j=1;

        while(j<n ) {
            if(A[j]-A[i]==k) {
                return true;
            }
            else if(A[j]-A[i]<k) {
                j++;
            }
            else {
                i++;
            }
        }
        return false;
    }
}
