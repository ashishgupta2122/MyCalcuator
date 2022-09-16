package com.ashish.mycalculator;
import java.util.*;
public class FindTheMisingNumber_Repeating {
    public static void main(String[] args)
    {
        int arr[] = {3,1,2,5,3};
        Map<Integer,Boolean> s1 = new HashMap<>();

        int n = arr.length;
        for (int i : arr)
        {
            if (s1.get(i) == null)
            {
                s1.put(i,true);
            }
            else
            {
                System.out.println("Repeating = "+i);
            }
        }
        for (int i = 0; i < n; i++)
        {
            if (s1.get(i) == null)
            {
                System.out.println("Missing = "+i);
            }
        }
    }
}