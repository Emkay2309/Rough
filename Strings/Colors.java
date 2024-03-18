package Strings;

import java.util.ArrayList;
import java.util.List;

public class Colors {
    public static void main (String[] args) throws java.lang.Exception {
        String[] colors = {
                "red", "blue", "green"
        };
        colorPattern(colors);
    }
    static  void colorPattern (String [] colors)  {
        int n = colors.length;

        List<List<String>> ans = new ArrayList<>();

        int maxLen = 0;
        for(String s : colors) {
            maxLen = Math.max(maxLen , s.length());
        }

        for(int i=0 ; i<maxLen ; i++)  {
            String temp = "";
            for(String s : colors)  {
                if(i < s.length()) {
                    temp += s.charAt(i);
                    temp += " ";
                }
            }
            System.out.println(temp);
            List<String> row = new ArrayList<>();
            row.add(temp);
            ans.add(row);
        }
    }
}
