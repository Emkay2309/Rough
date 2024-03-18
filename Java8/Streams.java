package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        String [] arr = {"Hello" , "How" , "are" , "you" , "doing" , "?"};

        ArrayList<String> ans = (ArrayList<String>) Arrays.stream(arr)
                .filter(e -> e.startsWith("H"))
                .map(e -> e)
                .collect(Collectors.toList());

        for (String a: ans) {
            System.out.println(a);
        }

    }
}
