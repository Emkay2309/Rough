package Strings;

public class PrintPattern {
    public static void main(String[] args) {

        int n = 4; // Define the size of the pattern

        // Iterate through rows
        for (int i = 0; i < 2 * n - 1; i++) {
            // Iterate through columns
            for (int j = 0; j < 2 * n - 1; j++) {
                // Condition to print the appropriate character based on the pattern
                int min = Math.min(i, j);
                min = Math.min(min, 2 * n - 2 - i);
                min = Math.min(min, 2 * n - 2 - j);
                System.out.print(n - min);
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }


}

