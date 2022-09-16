package com.ashish.mycalculator.temp;
import java.util.*;
public class FindFourElementThatSum {
    public static int Find(int arr[],int n,int sum)
    {
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] + arr[j] == sum)
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {10,2,3,4,5,9,7,8};
        int sum = 23;
        int n = arr.length;
        int index = Find(arr,n,sum);
        if (index == -1)
        {
            System.out.println("Sum is Not Contains of Array index");
        }
        else
        {
            System.out.println("Sum is Present in Array at index "+arr[index]);
        }
    }
}
