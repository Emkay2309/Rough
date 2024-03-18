package Practice.MountblueString;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> ans = solve(strs);

        for (List<String> innerList : ans) {
            for (String value : innerList) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    static List<List<String>> solve(String [] strings)  {
        Map<String , List<String>> map = new HashMap<>();

        for(String word : strings)  {
            char [] wordArray = word.toCharArray();
            Arrays.sort(wordArray);

            String sortedWord = new String(wordArray);

            if(!map.containsKey(sortedWord))  {
                map.put(sortedWord , new ArrayList<>());
            }
             map.get(sortedWord).add(word);

        }
        return new ArrayList<>(map.values());
    }
}
