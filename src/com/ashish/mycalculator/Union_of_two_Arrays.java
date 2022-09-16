package com.ashish.mycalculator;
import java.util.*;
public class Union_of_two_Arrays {
    public static int Union(int arr[],int brr[])
    {
        Set<Integer> sc = new HashSet<>();
        for (int element : arr)
        {
            sc.add(element);
        }
        for (int element : brr)
        {
            sc.add(element);
        }
        return sc.size();
    }
    public static void main(String[] args)
    {
        int arr[] = {5,10,15,5};
        int brr[] = {10,15,4,5};
        System.out.println("Union of Array "+Union(arr,brr));
    }
}