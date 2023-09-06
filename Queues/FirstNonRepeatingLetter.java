package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
    public static void printNonRepeating (String str) {
        Queue <Character> q = new LinkedList<>();
        int [] count = new int [26];

        for(int i=0 ; i<str.length() ; i++) {
            char ch = str.charAt(i);
            q.add(ch);
            count[ch-'a']++;

            while(!q.isEmpty() && count[q.peek()-'a'] > 1) {
                q.remove();
            }
            //case 1
            if(q.isEmpty()) {
                System.out.print(-1+" ");
            }
            else {
                System.out.print(q.peek()+" ");
            }

        }
    }
}
