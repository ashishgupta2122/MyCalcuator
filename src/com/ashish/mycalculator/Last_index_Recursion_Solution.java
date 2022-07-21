package com.ashish.mycalculator;
import java.util.Scanner;
public class Last_index_Recursion_Solution {
    public static int Last_index(int arr[],int k,int startIndex)
    {
        if (startIndex== arr.length)
        {
            return -1;
        }
        if (arr[startIndex] == k)
        {
            return startIndex;
        }
        return Last_index(arr,k,startIndex - 1);
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,4,6,8,5,2,4,6};
        int n = arr.length- 1;
        int ans = Last_index(arr,2,n);
        System.out.println(ans+" ");
    }
}