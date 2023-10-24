package Array;
import java.util.*;
public class MaxProfitStock {
    public static int Max(int arr[]) {
        int minSofor = arr[0];
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            minSofor = Math.min(minSofor,arr[i]);
            int profit = arr[i] - minSofor;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {10,19,1,30,32};
        System.out.println("Maximum Profit "+Max(arr));
    }
}
