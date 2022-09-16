package com.ashish.mycalculator;
import java.util.*;
public class PermuteTwoArraysSuchThat_SumofEveryPair {
    public static boolean isPossible(Integer arr[],Integer brr[],int key,int n)
    {
        Arrays.sort(arr,Collections.reverseOrder());

        Arrays.sort(brr);

        for (int i = 0; i < n; i++)
        {
            if (arr[i] + brr[i] < key)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Integer arr[] = {2, 1, 3};
        Integer brr[] = {7,8,9};
        int key = 10;
        int n = arr.length;

        if (isPossible(arr,brr,key,n))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
