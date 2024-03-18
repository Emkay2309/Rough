package Arrays.TwoDArray;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbcccddd";
        int n = s.length();
        String ans = "";

        for(int i=1 ; i<n ; i++)  {
            int count = 1;
            char curr = s.charAt(i);

            while( i <= n-1 &&  s.charAt(i) == s.charAt(i-1)) {
                count++;
                i++;
            }

            ans += curr;
            ans += Integer.toString(count);
        }
        System.out.println(ans);
    }
}
