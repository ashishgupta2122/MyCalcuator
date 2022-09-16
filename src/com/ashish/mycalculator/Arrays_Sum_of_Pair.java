package com.ashish.mycalculator;
import java.util.*;
public class Arrays_Sum_of_Pair {
    public static void Pairs(int arr[],int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] + arr[j] == key)
                {
                    System.out.println(arr[i]+" "+arr[j]+" = "+key);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {2, 7, 4, -5, 11, 5, 20, 15};
    }
}
