package Arrays.TwoDArray;

public class ConvertUpperCase {
    public static void main(String[] args) {
        String str = "hi , i am mohsin";

        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1 ; i<str.length() ; i++)  {

            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            //If First Word
            if( Character.isAlphabetic(curr)  &&  prev == ' ') {
                Character temp = Character.toUpperCase(curr);
                sb.append(temp);
            }
            else {
                sb.append(curr);
            }
        }
        System.out.println(sb.toString());
    }
}
