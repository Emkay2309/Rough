package Strings;

public class PatternMaking {
    public static void main(String[] args) {
        int n = 4;
        //4444444
//        33333
//        222
//        1
//        222
//        33333


        for(int i=n ; i>0 ; i--) {
            int times = 2*i-1;
            int val = i;
            for(int j=0 ; j<times ; j++) {
                System.out.print(val);
            }
            System.out.println();
        }

        for(int i=2 ; i<=n ; i++) {
            int times = 2*i-1;
            int val = i;
            for(int j=0 ; j<times ; j++) {
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
