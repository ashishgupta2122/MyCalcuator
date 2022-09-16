package com.ashish.mycalculator.temp;
import java.util.*;
public class KadaneAlgorithm {
    public static int MaximumSubArray(int arr[])
    {
        int currsum = 0;
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            currsum += arr[i];
            if (currsum > maxsum)
            {
                maxsum = currsum;
            }
            if (currsum < 0)
            {
                currsum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,-3,3,2,-6,4};
        System.out.println("The Maximum Number of Array "+MaximumSubArray(arr));
    }
}