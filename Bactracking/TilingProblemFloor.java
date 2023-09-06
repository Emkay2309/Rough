package Bactracking;

import org.w3c.dom.ls.LSOutput;

public class TilingProblemFloor {
    public static void main(String[] args) {
        int N = 4;
        System.out.print(solution(N));
    }

    private static int solution(int N) {
        if(N==0 || N==1) return 1;

        //vertical
        int verticalSide = solution(N-1);

        //horizontal
        int horizontalSide = solution(N-2);

        return horizontalSide + verticalSide;
    }
}
