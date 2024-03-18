package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Basics {
    public static void main(String[] args) {
        assignEntry();
    }

    public static void assignEntry() {
        Map<Integer , Integer> map = new HashMap<>();

        int [] arr = {1,1,2,2,2,31,1,1,2,31,4,5,7};

        for( int i : arr) {
            map.put( i , map.getOrDefault( i , 0)+1);
        }

        var entrySet = map.entrySet();

        for(var entry : entrySet) {
            System.out.println("key : " + entry.getKey()  + " , " + "value : " + entry.getValue());
        }

        List<Integer> ans = entrySet.stream().filter(e -> e.getValue()==0).map(Map.Entry::getKey).collect(Collectors.toList());

    }
    public static void IterationOnMap() {
        Map<Integer , String> map = new HashMap<>();

        map.put(100 , "AAA");
        map.put(200 , "BBB");
        map.put(300 , "CCC");
        map.put(400 , "DDD");

        var entrySet = map.entrySet();

        for(var entry : entrySet) {
            System.out.println("key : " + entry.getKey()  + " , " + "value : " + entry.getValue());
        }
    }
}
