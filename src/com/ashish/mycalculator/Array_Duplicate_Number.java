package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Duplicate_Number {
    public static int Duplicate_Number(int arr[],int n)
    {
        for (int i = 0; i < n-1; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {2,1,0,4,3,2};
        int n = arr.length;
        System.out.println(Duplicate_Number(arr,n));
    }
}
