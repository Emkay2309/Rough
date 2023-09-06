package Bactracking;

public class RemovrDuplicatesInString {
    public static void main(String[] args) {
        String s = "appnnacollege";
        removeDuplicates(s , 0 , new StringBuilder() , new boolean [26]);
    }

    private static void removeDuplicates(String str, int index, StringBuilder sb, boolean[] map) {
        if(str.length() == index) {
            System.out.println(sb);
            return;
        }
        char ch = str.charAt(index);

        if(map[ch-'a'] == true) {
            removeDuplicates(str , index+1 , sb , map);
        }
        else {
            map[ch-'a'] = true;
            removeDuplicates(str , index+1 , sb.append(ch) , map);
        }
    }


}
