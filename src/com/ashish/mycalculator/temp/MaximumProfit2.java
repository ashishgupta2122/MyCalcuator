package com.ashish.mycalculator.temp;
import java.util.*;
public class MaximumProfit2 {
    public static int MaxProfit(int arr[])
    {
        int profit = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > arr[i-1])
            {
                profit += arr[i] - arr[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args)
    {
        int arr[] = {5,2,7,3,6,1,2,4};
        System.out.println("Maximum Profit of "+MaxProfit(arr));
    }
}
