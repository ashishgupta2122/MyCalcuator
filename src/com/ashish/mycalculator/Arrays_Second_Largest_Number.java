package com.ashish.mycalculator;
import java.util.*;
public class Arrays_Second_Largest_Number {
    public static void main(String[] args)
    {
        int arr[] = {12,34,56,2,34,58};
        System.out.println("Original Array : "+Arrays.toString(arr));
        Arrays.sort(arr);
        int n = arr.length - 1;
        while (arr[n] == arr[n-1])
        {
            n--;
        }
        System.out.println("Second Largest Element in Array "+arr[n]);
    }
}
