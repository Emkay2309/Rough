package Strings;

public class PermutationOfAinB {
    public static void main(String[] args) {
        String A = "abc";
        String B = "";
        System.out.println(countperm(A,B));
    }
    public static int countperm(String A, String B) {
        int count =0;

        int s = 0;
        int e = A.length()-1;
        int windowSize = A.length();

        int [] freqA  = new int [26];
        for(int i=0 ; i<A.length() ; i++) {
            int index = A.charAt(i)-'a';
            freqA[index]++;
        }

        int [] freqB  = new int [26];
        for(int i=s ; i<=e ; i++) {
            int index = B.charAt(i)-'a';
            freqB[index]++;
        }

        if(freqA == freqB) {
            count++;
        }

        while(e < B.length() ) {
            e++;
            s++;
            int index = B.charAt(e)-'a';
            freqB[index]++;

            //remove effect of s-1
            int index1 = B.charAt(s-1)-'a';
            freqB[index]--;

            if(freqA == freqB) {
                count++;
            }
        }
        return count;
    }
}
