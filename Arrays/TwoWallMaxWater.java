package Arrays;

public class TwoWallMaxWater {
    public static void main(String[] args) {
        int [] A = {3,5,4,7,3,6,5,4,1,2};
        System.out.println(checkDifference(A));
    }
    public static int checkDifference (int [] A) {
        int n = A.length;
        int maxWater = 0;
        int i=0 ;
        int j=n-1;

        while(i<j ) {

            int height = Math.min(A[i],A[j]);
            int width = j-i;
            int waterCollected = height * width;
            maxWater = Math.max(waterCollected,maxWater);

            if(A[i]<=A[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return maxWater;
    }
}
