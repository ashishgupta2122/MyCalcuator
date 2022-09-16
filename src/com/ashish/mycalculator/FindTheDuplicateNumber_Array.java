package com.ashish.mycalculator;
import java.util.*;
public class FindTheDuplicateNumber_Array {
    public static void Duplicate(int arr[])
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j] && i != j)
                {
                    System.out.print(" "+ arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,3,1,3,0};
        Duplicate(arr);
    }
}
