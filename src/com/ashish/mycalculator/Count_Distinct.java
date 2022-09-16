package com.ashish.mycalculator;
import java.util.*;
public class Count_Distinct {
    public static int Count(int arr[])
    {
        Set<Integer> sc = new HashSet<>();
        for (int element : arr)
        {
            sc.add(element);
        }
        return sc.size();
    }
    public static void main(String[] args)
    {
        int arr[] = {5,10,4,15,5,4};
        System.out.println(Count(arr));
    }
}