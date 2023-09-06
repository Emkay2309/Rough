package Practice.StackPractice;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int [] stocks = { 100, 80 ,60, 70 ,60 ,85 ,100};

        int [] ans = Stock(stocks);

        for(int i=0 ; i<ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int [] Stock(int [] stocks) {
        int n = stocks.length;
        int [] ans = new int [n];

        Stack<Integer> s = new Stack<>();
        ans[0] = 1;
        s.push(0);

        for(int i=1 ; i<n ; i++) {

            while(!s.isEmpty() && stocks[s.peek()] <= stocks[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                ans[i] = i+1;
            }
            else {
                int val = s.peek();
                ans[i] = i - val;
            }
            s.push(i);
        }
        return ans;
    }
}
