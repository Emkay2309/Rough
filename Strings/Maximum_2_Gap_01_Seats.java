package Strings;

public class Maximum_2_Gap_01_Seats {
    public static void main(String[] args) {
        int[] seats1 = {0, 0, 0, 1, 0, 0, 1, 0, 0, 0};
        int[] seats2 = {0, 0, 0, 0};
        int[] seats3 = {1, 0, 0, 0, 0, 1};

        System.out.println(maximumSeating(seats1)); // Output: 2
        System.out.println(maximumSeating(seats2)); // Output: 2
        System.out.println(maximumSeating(seats3)); // Output: 0
    }
    public static int maximumSeating(int[] seats) {
        int maxNewPeople = 0;
        int count = 0;

        for (int seat : seats) {
            if (seat == 0) {
                count++;
                if (count == 3) {
                    maxNewPeople++;
                    count = 2; // Reset count for the next gap
                }
            } else {
                count = 0; // Reset count as the gap is broken
            }
        }

        return maxNewPeople;
    }
}
