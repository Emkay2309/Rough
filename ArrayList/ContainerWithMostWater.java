package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int maxWater = 0;
        //brute force approach
        for (int i = 0; i < height.size()-1; i++) {
            for(int j=i+1 ; j<height.size() ; j++) {
                int ht = Math.min(height.get(j), height.get(i));
                int width = j-i;
                int currWater = width* ht;
                maxWater = Math.max(currWater,maxWater);
            }
        }
        System.out.println(maxWater);

        int ans = storeWater(height);
        System.out.println(ans);
    }
    public static  int storeWater (ArrayList<Integer>height) {
        int maxWater = 0;
        //2 pointer Approach
        int leftpointer = 0;
        int rightpointer = height.size()-1;

        while(leftpointer < rightpointer) {
            int ht = Math.min(height.get(leftpointer) , height.get(rightpointer));
            int width = rightpointer - leftpointer;
            int currWater = ht*width;
            maxWater = Math.max(currWater,maxWater);

            if(height.get(leftpointer) < height.get(rightpointer)) {
                leftpointer++;
            }
            else {
                rightpointer--;
            }
        }
        return maxWater;
    }
}
