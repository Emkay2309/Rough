package Arrays;

public class TwoSumOptimized {
    public static void main(String[] args) {
        int []  A = {-3,0,1,3,6,8,11,14,25};
        int n = A.length;
        int k =17;

        int i=0 , j = n-1;

        while(i<=j) {
            if(A[i]+A[j]==k) {
                System.out.println("index i:"+i+" value:"+ A[i] + " , index j:"+j+" value "+ A[j]);
                break;
            }
            if(A[i]+A[j]>k) {
                j--;
            }
            else {
                i++;
            }
        }
    }
}
