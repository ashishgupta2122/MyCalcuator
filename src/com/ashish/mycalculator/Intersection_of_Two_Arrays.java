package com.ashish.mycalculator;
import java.util.*;
public class Intersection_of_Two_Arrays {
    public static int Insertion(int arr[],int brr[])
    {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int element : arr)
        {
            set.add(element);
        }
        for (int element : brr)
        {
            if (set.contains(element))
            {
                count++;
                set.remove(element);
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {5,10,15,5,10};
        int brr[] = {15,10,4};
        System.out.println(Insertion(arr,brr));
    }
}