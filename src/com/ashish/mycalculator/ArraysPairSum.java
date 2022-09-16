package com.ashish.mycalculator;
import java.util.*;
public class ArraysPairSum {
    public static boolean Sum(int arr[],int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == key)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[] = {11, 15, 26, 38, 9, 10};
        int key = 45;
        System.out.println(Sum(arr,key));
    }
}
