package com.ashish.mycalculator.temp;
import java.util.*;
public class FindMaximumRepeatingNumber {
    public static int Repeat(int arr[],int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                while (arr[i] == arr[j] && i != j)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,12,12,0,12,0,12,3,8,0,9,12,3};
        int n = arr.length;
        System.out.println("The Maximum Number of Repeat at index "+Repeat(arr,n));
    }
}
