package ArrayList;

import java.util.ArrayList;

public class PairSum1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        boolean ans = pair(list,target);
        System.out.println(ans);

        int lp = 0;
        int rp = list.size()-1;

        while(lp<=rp) {
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(list.get(lp) +"+"+ list.get(rp));
                break;
            }
            else if(list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            else {
                rp--;
            }
        }
    }

    public static boolean pair(ArrayList<Integer> list , int target) {
        for (int i = 0; i < list.size(); i++) {
            for(int j= i+1 ; j<list.size() ; j++) {
                if(list.get(i)+list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
