package com.ashish.mycalculator;
import java.util.*;
public class SellStockMaximiseProfit {
    public static int Maxprofit(int arr[])
    {
        int maxProfit = 0;
        int minsofor = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            minsofor = Math.min(minsofor,arr[i]);
            int profit = arr[i] - minsofor;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args)
    {
        int arr[] = {3,1,4,8,7,2,5};
        System.out.println("Maximum Profit of "+Maxprofit(arr));
    }
}
