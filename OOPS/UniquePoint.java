package OOPS;

import java.util.HashMap;

public class UniquePoint {
    public static void main(String[] args) {
        Point P1 = new Point(4,2);
        Point P2 = new Point(0,5);
        Point P3 = new Point(6,98);
        Point P4 = new Point(4,2);
        Point P5 = new Point(0,5);
        Point P6 = new Point(7 ,3);
        Point P7 = new Point(98,6);

        HashMap <Point , Boolean > hm = new HashMap<>();

        hm.put(P1,true);
        hm.put(P2,true);
        hm.put(P3,true);
        hm.put(P4,true);
        hm.put(P5,true);
        hm.put(P6,true);
        hm.put(P7,true);

        System.out.println(hm.size());
    }
}
