package Strings;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println(solve(s));
    }
    static  String solve(String s)  {
        int  n = s.length();
        String ans = "";
        int index = 0;

        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        while(index < n) {
            char ch = s.charAt(index);

            if(Character.isDigit(ch))  { // If the character is Digit
                //Start creating the Number
                int count = 0;
                while(Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                numStack.push(count);
            }
            else if(ch == '[') {         // If the character is [
                stringStack.push(ans);
                ans = "";
                index++;
            }
            else if(ch == ']')  {        // If the character is ]
                //Start creating the string
                String temp = stringStack.pop();
                int num = numStack.pop();

                StringBuilder tempString = new StringBuilder(temp);
                for(int i=0 ; i<num ; i++)  {
                    tempString.append(ans);
                }
                ans = tempString.toString();
                index++;
            }
            else {                       //If the character is string
                ans += ch;
                index++;
            }
        }

        return ans;
    }
}
//abcabccdcdcdef
//abcabccdcdcdef
