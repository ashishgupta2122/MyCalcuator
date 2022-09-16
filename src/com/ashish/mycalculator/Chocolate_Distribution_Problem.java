package com.ashish.mycalculator;
import java.util.*;
public class Chocolate_Distribution_Problem {
    public static int findminDiff(int arr[],int n,int m)
    {
        if (m == 0 || n == 0)
        {
            return 0;
        }
        Arrays.sort(arr);
        if (n < m)
        {
            return -1;
        }

        int min_Diff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if (diff < min_Diff)
            {
                min_Diff = diff;
            }
        }
        return min_Diff;
    }
    public static void main(String[] args)
    {
        int arr[] = {7,3,2,4,9,12,56};
        int m = 3;
        int n = arr.length;
        System.out.println("The Minimum Difference of "+findminDiff(arr,n,m));
    }
}
