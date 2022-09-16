package com.ashish.mycalculator;
import java.util.*;
public class MergeSortedArrays {
    public static void Merge(int arr1[],int arr2[],int m,int n)
    {
        int i = 0;
        int j = 0;
        int k = m - 1;

        while (i <= k && j < n)
        {
            if (arr1[i] < arr2[j])
            {
                i++;
            }
            else
            {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        int arr1[] = {1,5,9,10,15,20};
        int arr2[] = {2,3,8,13};
        int m = arr1.length;
        int n = arr2.length;
        Merge(arr1,arr2,m,n);
        System.out.println("After Merging ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Second Array ");
        System.out.println(Arrays.toString(arr2));
    }
}
