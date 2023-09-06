package Maths;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(countPrime(n));
    }
    public static int countFactors(int n) {
        int factors = 0;

        for(int i=1 ; i*i<=n ; i++) {
            if(n%i==0) {
                if(n/i == i ) {
                    factors += 1;
                }
                else {
                    factors += 2;
                }
            }
        }
        return factors;
    }

    public static int countPrime(int n) {
        if(n==2 ) {
            return 1;
        }
        System.out.print(2 +" ");
        if(n==3 ) {
            return 2;
        }
        System.out.print(3 +" ");
        int prime = 2;

        for(int i=1 ; i*6+1 <= n ; i++) {
            int value = countFactors(6*i-1);
            if(value == 2 ) {
                prime++;
                System.out.print(6*i-1 + " ");
            }
            int value2 = countFactors(6*i+1);

            if(value2 == 2) {
                prime++;
                System.out.print(6*i+1 + " ");
            }
        }
        System.out.println();
        return prime;
    }
}
