package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Pair_Sum {
    public static int pair(int arr[],int n,int sum)
    {
        int numpairs = 0;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                if (arr[i] + arr[j] == sum)
                {
                    numpairs += 1;
                }
            }
        }
        return numpairs;
    }
    public static void main(String[] args)
    {
        int arr[] = {6,3,4,6,1,7,2,6};
        int n = arr.length;
        System.out.println(pair(arr,n,7));
    }
}
