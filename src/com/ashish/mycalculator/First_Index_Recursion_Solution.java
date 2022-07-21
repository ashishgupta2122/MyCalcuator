package com.ashish.mycalculator;
import java.util.Scanner;
public class First_Index_Recursion_Solution {
    public static int first(int arr[],int k,int startIndex)
    {
        if(startIndex == arr.length)
        {
            return -1;
        }
        if (arr[startIndex] == k)
        {
            return startIndex;
        }
         return first(arr,k,startIndex+1);
    }
    public static int first(int arr[],int k)
    {
        return first(arr,k,0);
    }
    public static void main(String[] args)
    {
        int arr[] = {2,3,4,5,6,7};
        int ans = first(arr,5,0);
        System.out.print(ans+" ");
    }
}
