package Hashing.Anagram;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class FindAllAnagram {
    public static void main(String[] args) {
        String s = "abbacdadcdab";
        String p = "abbc";

    }
    private  static int fun(String s , String p) {

        int n = s.length();
        int m = p.length();

        Map<Character , Integer> pmap = new HashMap<>();

        for(int i=0 ; i<m ; i++) {
            char ch = p.charAt(i);
            pmap.put(ch , pmap.getOrDefault(ch,0) + 1 );
        }

        Map<Character , Integer> smap = new HashMap<>();
        for(int i=0 ; i<p.length() ; i++ )  {
            char ch = s.charAt(i);
            smap.put(ch , smap.getOrDefault(ch , 0)+1);
        }

        int j=0;
        int i=p.length();
        int count = 0;

        while( i < s.length()) {
            if(compare(pmap , smap) == true) {
                count++;
            }

            char chadd = s.charAt(i);
            smap.put(chadd , smap.getOrDefault(chadd , 0)+1);

            char chremove = s.charAt(i-p.length());
            if(smap.get(chremove) == 0) {
                smap.remove(chremove);
            }
            else {
                smap.put(chremove , smap.get(chremove)-1);
            }

        }

        if(compare(pmap , smap) == true) {
            count++;
        }
        return count;
    }

    private static boolean compare(Map<Character, Integer> pmap, Map<Character, Integer> smap) {
        for(char sch : smap.keySet()) {
            if(pmap.getOrDefault(sch , 0) != smap.get(sch)) {
                return false;
            }
        }
        return true;


    }
}
