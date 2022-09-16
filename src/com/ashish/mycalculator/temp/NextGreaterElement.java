package com.ashish.mycalculator.temp;
import java.util.*;
public class NextGreaterElement {
    public static void printNge(int arr[],int n)
    {
        int next;
        for (int i = 0; i < n; i++)
        {
            next = -1;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] < arr[j])
                {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" "+ next);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {4,5,2,25};
        int n = arr.length;
        printNge(arr,n);
    }
}
