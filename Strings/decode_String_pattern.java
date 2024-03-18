package Strings;

import java.util.Stack;

public class decode_String_pattern {
    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";      //   2[3[cd]2[ab]] --> cdcdcdabab
        System.out.println(solve(s));
    }
    static String solve(String s )  {
        String ans = "";
        int n = s.length();

        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int i = 0;

        while( i  <  n)  {
            char ch = s.charAt(i);

            //if ch is a digit
            if(Character.isDigit(ch)) {
                //Create the number
                int number = 0;
                while (Character.isDigit(s.charAt(i))) {
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }
                numberStack.push(number);
            }
            //if ch == '['
            else if(ch == '[')  {
                stringStack.push(ans);
                ans = "";
                i++;
            }
            //if ch == ']'
            else if(ch == ']')  {
                //Create the String

                String str = stringStack.pop();  //cd
                int num = numberStack.pop();     //300

                StringBuilder temp = new StringBuilder(str);
                while(num > 0)  {
                    temp.append(ans);
                    num--;
                }
                ans = temp.toString();
                i++;

            }
            //if ch == string character
            else {
                ans += ch;
                i++;
            }
        }

        return ans;
    }
}
