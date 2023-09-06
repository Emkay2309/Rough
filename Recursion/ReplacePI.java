package Recursion;

public class ReplacePI {
    public static void main(String[] args) {
        String s = "pippiippip";

        String ans = "";

        for(int i=0 ; i<s.length() ; i++) {
            char ch = s.charAt(i);

            if(ch != 'p' && ch != 'i' ) {
                ans += ch;
            }
            else if(ch=='p' && i<s.length()-1) {
                char ch2 = s.charAt(i+1);
                if(ch2=='i') {
                    ans += 3.14;
                }
            }
        }
        System.out.println(ans);
    }
}
