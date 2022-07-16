package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Unique_Solve {
    public static void main(String[] args)
    {
        int arr[] = {6,6,8,5,2,2,8};
        int ans = 0;
        for (int i = 0; i < arr.length; i++)
        {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}