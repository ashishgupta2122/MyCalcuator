package com.ashish.mycalculator.temp;
import java.util.*;
public class CountDistinctElements {
    public static void Count(int arr[],int key)
    {
        HashMap<Integer,Integer> s1 = new HashMap<>();
        for (int i = 0; i < key; i++)
        {
            s1.put(arr[i],s1.getOrDefault(arr[i],0)+1);
        }
        System.out.println(s1.size());
        for (int i = key; i < arr.length; i++)
        {
            if (s1.get(arr[i-key]) == 1)
            {
                s1.remove(arr[i-key]);
            }
            else
            {
                s1.put(arr[i-key],s1.get(arr[i-key])-1);
            }
            s1.put(arr[i], s1.getOrDefault(arr[i],0)+1);
            System.out.println(s1.size());
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,2,1,3,1,1,3};
        int key = 4;
        Count(arr,key);
    }
}
