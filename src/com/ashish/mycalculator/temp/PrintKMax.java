package com.ashish.mycalculator.temp;
import java.util.*;
public class PrintKMax {
    public static void Max(int arr[],int n,int k)
    {
        int max = 0;
        for (int i = 0; i <= n - k; i++)
        {
            max = arr[i];
            for (int j = 1; j < k; j++)
            {
                if(arr[i+j] > max)
                {
                    max = arr[i+j];
                }
            }
            System.out.print(max + " ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int k = 3;
        Max(arr,n,k);
    }
}
