package com.ashish.mycalculator.temp;
import java.util.*;
public class MaxProfitArray {
    public static int MaxProfit(int arr[])
    {
        int maxprofit = 0;
        int Minsofor = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            Minsofor = Math.min(Minsofor,arr[i]);
            int profit = arr[i] - Minsofor;
            maxprofit = Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
    public static void main(String[] args)
    {
        int arr[] = {5,2,6,1,4};
        System.out.println("Maximum Profit of "+MaxProfit(arr));
    }
}
