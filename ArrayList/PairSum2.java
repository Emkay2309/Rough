package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        int pivot = 0;

        for(int i=0 ; i<list.size()-1 ; i++) {
            if(list.get(i)>list.get(i+1)) {
                pivot = i;
                break;
            }
        }

        int rp = pivot;
        int lp = pivot+1;

        while(lp<list.size() && rp>=0) {
            if(list.get(lp) + list.get(rp) == target) {
                System.out.println(list.get(lp) +"+"+ list.get(rp));
                break;
            }
            else if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1)%list.size();
            }
            else {
                rp = (list.size()+rp-1)%list.size();
            }
        }
        //lp!=rp
    }
}
