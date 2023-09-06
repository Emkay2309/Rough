package Greedy_Algorithmn;
import java.util.*;

public class FractionalPairs {
        static class Pair{
            int weight;
            int value;
            Pair(int weight, int value){
                this.weight = weight;
                this.value = value;
            }
        }
        public static void main(String[] args) {
            Pair [] items = new Pair [6];
            items[0] = new Pair (50,40);
            items[1] = new Pair (40,50);
            items[2] = new Pair (90,25);
            items[3] = new Pair (120,100);
            items[4] = new Pair (10,30);
            items[5] = new Pair (200,45);


            System.out.println(maximumValue(items,5,200));
        }

        public static double maximumValue(Pair[] items, int n, int w) {
            double ans = 0;
            double [] [] check = new double [items.length] [4];
            for(int i=0 ; i<n ; i++) {
                Pair p = items[i];
                int weight = p.weight;
                int value = p.value;
                double ratio = (double)value/weight;
                check[i][0] = i;
                check[i][1] = ratio;
                check[i][2] = value;
                check[i][3] = weight;
            }
            Arrays.sort(check , Comparator.comparingDouble(O -> O[1]));

            for(int i=check.length-1 ; i>=0 ; i--) {
                int index = (int)check[i][0];

                if(w >= check[i][3]) {
                    ans += check[i][2];
                    w -= check[i][3];
                    if(w==0) return ans;
                }
                else {
                    ans += ((check[i][3] / w) * check[i][2]);
                    w = 0;
                    break;
                }
            }
            return ans;
        }
}
