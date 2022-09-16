package com.ashish.mycalculator;
import java.util.*;
public class MergeTwoSortedArrays {
    public static void Merge(int arr1[],int arr2[],int m,int n)
    {
        Map<Integer,Boolean> s1 = new HashMap<>();
        for (int i = 0; i < m; i++)
        {
            s1.put(arr1[i],true);
        }
        for (int i = 0; i < n; i++)
        {
            s1.put(arr2[i],true);
        }
        for (Map.Entry<Integer,Boolean> me : s1.entrySet())
        {
            System.out.print(me.getKey()+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr1[] = {1,3,5,7};
        int arr2[] = {2,4,6,8};
        int m = arr1.length;
        int n = arr2.length;
        Merge(arr1,arr2,m,n);
    }
}
