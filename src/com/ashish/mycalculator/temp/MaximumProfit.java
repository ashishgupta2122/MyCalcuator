package com.ashish.mycalculator.temp;
import java.util.*;
public class MaximumProfit {
    public static int Maximum(int arr[])
    {
        int maxfor = 0;
        int minsofor = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            minsofor = Math.min(minsofor,arr[i]);
            int profit = arr[i] - minsofor;
            maxfor = Math.max(maxfor,profit);
        }
        return maxfor;
    }
    public static void main(String[] args)
    {
        int arr[] = {3,5,1,7,4,9,3};
        System.out.println("Maximum Profit of "+Maximum(arr));
    }
}
