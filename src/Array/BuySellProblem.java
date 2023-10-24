package Array;
import java.util.*;
public class BuySellProblem {
    public static int MaxProfit(int prices[]) {
        int minsofor = prices[0];
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            minsofor = Math.min(minsofor,prices[i]);
            int profit = prices[i] - minsofor;
            maxprofit = Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit of "+MaxProfit(prices));
    }
}
