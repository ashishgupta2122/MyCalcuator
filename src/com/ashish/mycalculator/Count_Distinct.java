package com.ashish.mycalculator;
import java.util.*;
public class Count_Distinct {
    public static int count(int arr[])
    {
        Set<Integer>set = new HashSet<>();
        for (int element:arr)
        {
            set.add(element);
        }
        return set.size();
    }
    public static void main(String[] args)
    {
        int arr[] = {5,10,15,5,4,5};
        System.out.println(count(arr));
    }
}
