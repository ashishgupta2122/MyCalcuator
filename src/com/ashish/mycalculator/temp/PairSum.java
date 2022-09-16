package com.ashish.mycalculator.temp;
import java.util.*;
public class PairSum {
    public static void Pair(int arr[],int targert)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i]+arr[j] == targert)
                {
                    System.out.printf("Pair Found (%d %d)",arr[i],arr[j]);
                    return;
                }
            }
        }
        System.out.println("Pair Not Found");
    }
    public static void main(String[] args)
    {
        int arr[] = {8,7,2,5,3,1};
        int target = 10;
        Pair(arr,target);
    }
}
