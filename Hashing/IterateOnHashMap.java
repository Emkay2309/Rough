package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterateOnHashMap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k: keys) {
            System.out.println(k + "-->" + map.get(k));
        }

        Set<Map.Entry<String, Integer>> ans = map.entrySet();
        System.out.println(ans);



    }
}
