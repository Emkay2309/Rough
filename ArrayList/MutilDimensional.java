package ArrayList;

import java.util.ArrayList;

public class MutilDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);

        System.out.println(mainList);

        for(int i=0 ; i<mainList.size(); i++) {
            ArrayList <Integer> curr = new ArrayList<>();
            for(int j=0 ; j<curr.size() ; j++) {
                System.out.println(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
}
