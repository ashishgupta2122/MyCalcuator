package com.ashish.mycalculator.temp;
import java.util.*;
public class UnionOfTwoArrays {
    public static int Union(int arr[],int brr[])
    {
        HashSet<Integer> s1 = new HashSet<>();
        for (int x : arr)
        {
            s1.add(x);
        }
        for (int x : brr)
        {
            s1.add(x);
        }
        return s1.size();
    }
    public static void main(String[] args)
    {
        int arr[] = {5,10,15,5};
        int brr[] = {10,15,4};
        System.out.println("Union of Two Arrays Size "+Union(arr,brr));
    }
}
