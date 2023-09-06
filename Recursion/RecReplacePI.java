/**
 * RecReplacePI
 */
public class RecReplacePI {

    public static void main(String[] args) {
        System.out.println(PI("pipppipiip"));
    }


public static String PI (String s) {
        return helper(s,0,"");
    }
    public static String helper(String s , int i, String ans) {
        
        if(i==s.length()-1) {
            return ans+s.charAt(s.length()-1);
        }
        char ch = s.charAt(i);
        if(ch=='p' && s.charAt(i+1)=='i') {
            ans += "3.14";
            i=i+1;
        }
        else {
            ans += ch;
        }
        return helper(s,i+1,ans);
    
        
        
    }
}