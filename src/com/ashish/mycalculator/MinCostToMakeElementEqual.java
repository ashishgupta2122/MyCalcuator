package com.ashish.mycalculator;
import java.util.*;
public class MinCostToMakeElementEqual {
    public static int min(int arr[],int n)
    {
        int y;
        if (n % 2 == 1)
        {
            y = arr[n / 2];
        }
        else
        {
            y = (arr[n / 2] + arr[n - 2] / 2) / 2;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += Math.abs(arr[i] - y);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,100,101};
        int n = arr.length;
       // System.out.println("" +MinCostToMakeElementEqual(arr,n));
    }
}
