package com.ashish.mycalculator;
import java.util.*;
public class CountDistinct_Element {
    public static void Count(int arr[],int k)
    {
        Map<Integer,Integer> sc = new HashMap<>();
        for (int i = 0; i < k; i++)
        {
            sc.put(arr[i],sc.getOrDefault(arr[i],0)+1);
        }
        System.out.println(sc.size());

        for (int i = k; i < arr.length; i++)
        {
           // if (sc.get(arr[i - k] == 1))
            {

            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,2,1,3,1,1,3};
    }
}