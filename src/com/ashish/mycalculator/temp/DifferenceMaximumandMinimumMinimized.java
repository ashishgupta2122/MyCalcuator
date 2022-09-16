package com.ashish.mycalculator.temp;
import java.util.Arrays;
import java.util.Scanner;
public class DifferenceMaximumandMinimumMinimized {
    public static int mindiff(int arr[],int n,int key)
    {
        int result = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i <= n - key; i++)
        {
            result = Math.min(result,arr[i+key-1] - arr[i]);
        }
        return result;
    }
    public static void main(String[] args)
    {
        int arr[] = {10,100,300,200,1000,20,30};
        int n = arr.length;
        int key = 3;
        System.out.println("The Minimum Difference of "+mindiff(arr,n,key));
    }
}