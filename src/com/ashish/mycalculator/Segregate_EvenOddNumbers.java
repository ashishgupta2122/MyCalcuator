package com.ashish.mycalculator;
import java.util.*;
public class Segregate_EvenOddNumbers {
    public static void Segregrate(int arr[],int n)
    {
        int brr[] = new int[n];
        int start = 0;
        int end = n - 1;
        int i = 0;
        int j = 0;
        for (i = 0, j = n - 1; i < j; i++, j--)
        {

            if (arr[i] % 2 == 0)
            {
                brr[start] = arr[i];
                start++;
            }
            else
            {
                brr[end] = arr[i];
                end--;
            }

            if (arr[j] % 2 == 0)
            {
                brr[start] = arr[j];
                start++;
            }
            else
            {
                brr[end] = arr[j];
                end--;
            }
        }
        brr[i] = arr[i];
        for (i = 0; i < n; i++)
        {
            System.out.print(brr[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {12,34,8,90,45,9,3};
        int n = arr.length;
        Segregrate(arr, n);
    }
}