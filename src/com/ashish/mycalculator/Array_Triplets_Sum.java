package com.ashish.mycalculator;
import java.util.*;
public class Array_Triplets_Sum {
    public static boolean Triplets(int arr[],int n)
    {
        for (int i = 0; i < n - 2; i++)
        {
            for (int j = i + 1; j < n - 1; j++)
            {
                for (int k = j + 1; j < n; j++)
                {
                    if (arr[i] + arr[j] + arr[k] == 0)
                    {
                        System.out.println(arr[i] +" " + arr[j] +" " + arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[] = {0, -1, 2, -3, 1};
        int n = arr.length;
        System.out.println(Triplets(arr,n));
    }
}
