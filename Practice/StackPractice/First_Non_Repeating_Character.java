package Practice.StackPractice;

import java.util.HashMap;

public class First_Non_Repeating_Character {
    public static void main(String[] args) {
        String s = "echedfc";
        System.out.println(solve(s));
    }
    public static Character solve(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0; i<s.length() ; i++) {
            char ch = s.charAt(i);

            if(hm.containsKey(ch)) {
                hm.put(ch,(hm.get(ch))+1);
            }
            else {
                hm.put(ch,1);
            }
        }

        int n = hm.size();
        for(int j=0; j<s.length() ; j++) {
            char ch1 = s.charAt(j);
            if(hm.get(ch1)==1) {
                return ch1;
            }
        }
        return 'z';
    }
}
