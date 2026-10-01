import java.util.*;

public class stock {
    public static int maxProfit(int[] prices) {
        // brute force approach
        /*
         * int maxProfit=Integer.MIN_VALUE;
         * for(int i=0;i<prices.length-1;i++){
         * int profit=0;
         * for(int j=i+1;j<prices.length;j++){
         * profit=prices[j]-prices[i];
         * maxProfit=profit>maxProfit?profit:maxProfit;
         * }
         * }
         */
        
        //optimal approach
        int profit = 0;
        int buy_price = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            }
            profit = prices[i] - buy_price;
            maxProfit = profit > maxProfit ? profit : maxProfit;
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Given stock prices: " + Arrays.toString(prices));
        System.out.println("Maximum profit that can be achieved: " + maxProfit(prices));
    }
}
