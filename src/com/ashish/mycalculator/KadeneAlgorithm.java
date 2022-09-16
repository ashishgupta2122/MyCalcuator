package com.ashish.mycalculator;
import java.util.*;
public class KadeneAlgorithm {
    public static int Sum(int arr[])
    {
        int maxsum = 0;
        int currsum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            currsum += arr[i];
            if (currsum > maxsum)
            {
                maxsum = currsum;
            }
            else if (currsum < 0)
            {
                currsum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,-2,5};
        System.out.println(Sum(arr));
    }
}