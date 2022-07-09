package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Unique_Solve {
    public static void main(String[] args)
    {
        int arr[] = {2,6,8,5,6,2,8};
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++)
        {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}
