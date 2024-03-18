package Strings;

import java.util.*;

public class FindAnagram {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        List<Integer> ans = solve(s, p);
        System.out.print("[ ");
        for (Integer an : ans) {
            System.out.print(an + " , ");
        }
        System.out.print("]");
    }

    static List<Integer> solve2(String s , String p)   {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : p.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        int count = map.size();
        List<Integer> list = new LinkedList<>();
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            while (j < s.length()) {
                char currentChar = s.charAt(j);
                if (count == 0) {
                    break;
                } else if (map.containsKey(currentChar)) {
                    map.put(currentChar, map.get(currentChar) - 1);
                    if (map.get(currentChar) == 0) {
                        count--;
                    }
                }
                j++;
            }
            if (count == 0 && (j - i == p.length())) {
                list.add(i);
            }
            char removeChar = s.charAt(i);
            if (map.containsKey(removeChar)) {
                map.put(removeChar, map.get(removeChar) + 1);

                if (map.get(removeChar) > 0) {
                    count++;
                }
            }
        }
        return list;
    }

    static List<Integer> solve(String s , String p) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int m = p.length();

        int [] sFreq = new int [26];
        int [] pFreq = new int[26];

        for(int i=0 ; i<m ; i++) {
            char ch = p.charAt(i);
            pFreq[ch-'a']++;
        }

        for(int i=0 ; i<m ; i++) {
            char ch = s.charAt(i);
            sFreq[ch-'a']++;
        }

        for(int i=m ; i<n ; i++) {
            if(Arrays.equals(sFreq , pFreq))  {
                ans.add(i-m);
            }

            char add = s.charAt(i);
            char remove = s.charAt(i-m);

            sFreq[add - 'a']++;
            sFreq[remove - 'a']--;
        }
        return  ans;
    }
}
