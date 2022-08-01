package com.ashish.mycalculator;
import java.util.Scanner;
public class BestTimetobuyAndsellStock {
    public static int maxProfit(int arr[])
    {
        int maxProfit = 0;
        int minSofor = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            minSofor = Math.min(minSofor,arr[i]);
            int profit = arr[i] - minSofor;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args)
    {
        int arr[] = {3,1,4,8,7,2,5};
        System.out.println(maxProfit(arr));
    }
}
