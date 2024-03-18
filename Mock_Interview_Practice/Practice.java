package Mock_Interview_Practice;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5);

        Practice p = new Practice();
        arr.forEach(p :: display);




    }



    private void print(Integer integer) {
        System.out.print(integer + " ");
    }

    private void display(Integer i) {
        System.out.println("I am in the display method");
    }


}
