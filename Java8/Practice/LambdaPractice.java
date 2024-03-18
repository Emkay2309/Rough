package Java8.Practice;

import Java8.Lambda_Expressions.Child;

public class LambdaPractice {
    public static void main(String[] args) {


        // Steps to make any fn lambda

        // 1. remove modifier
        // 2. remove return type
        // 3. remove method name
        // 4. place arrow

         String s = "abcdeabcbbcdefgh";
         int n = s.length();
         int left = 0;
         int ans = 0;
         int [] freq = new int [128];

         for(int right=0 ; right < s.length() ; right++)  {
             char ch = s.charAt(right);

             freq[ch]++;

             if(freq[ch] == 1) {
                 int len = right - left + 1;
                 ans = Math.max(ans , len);
             }
             else if(freq[ch] == 2)  {
                 while(freq[ch] == 2) {
                     char remove = s.charAt(left);
                     freq[remove]--;
                     left++;
                 }
             }
         }
        System.out.println(ans);
    }

    private void sayHello() {
        System.out.println("Hello World...");
    }



}
