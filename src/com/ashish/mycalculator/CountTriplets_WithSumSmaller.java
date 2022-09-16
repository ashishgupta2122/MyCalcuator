package com.ashish.mycalculator;
import java.util.*;
public class CountTriplets_WithSumSmaller {
    public static int countTriplets(int arr[],int n,int sum)
    {
        int ans = 0;
        for (int i = 0; i < n - 2; i++)
        {
            for (int j = i + 1; j < n - 1; j++)
            {
                for (int k = j + 1; k < n; k++)
                {
                    if (arr[i] + arr[j] + arr[k] < sum)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {5, 1, 3, 4, 7};
        int sum = 12;
        int n = arr.length;
        System.out.println(countTriplets(arr,n,sum));
    }
}
