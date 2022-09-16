package com.ashish.mycalculator.temp;
import java.util.*;
public class IntersectionOfTwoArrays {
    public static int InterSection(int arr[],int brr[])
    {
        HashSet<Integer> s1 = new HashSet<>();
        int count = 0;
        for (int x : arr)
        {
            s1.add(x);
        }
        for (int x : brr)
        {
            if (s1.contains(x))
            {
                count++;
                s1.remove(x);
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {5,10,15,5,10};
        int brr[] = {15,5,10,4};
        System.out.println("Intersection of Two Arrays "+InterSection(arr,brr));
    }
}
