package com.ashish.mycalculator;
import java.util.Scanner;
public class Kadanes_Algorithm_largest_Sum {
    public static int maxSumSubArray(int arr[])
    {
        int maxSum = 0;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            currsum = currsum + arr[i];
            if (currsum > maxSum)
            {
                maxSum = currsum;
            }
            else if (currsum < 0)
            {
                currsum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,-2,5};
        System.out.println(maxSumSubArray(arr));
    }
}
