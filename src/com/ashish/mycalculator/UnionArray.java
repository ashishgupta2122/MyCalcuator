package com.ashish.mycalculator;
import java.util.*;
public class UnionArray {
    public static ArrayList<Integer> UnionArray(int arr1[],int arr2[],int m,int n)
    {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr1)
        {
            set.add(i);
        }
        for (int i : arr2)
        {
            set.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : set)
        {
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 2, 2, 3};
        int arr2[] = {2, 3, 3, 4, 5, 5};
        int m = arr1.length;
        int n = arr2.length;
        ArrayList<Integer> s1 = UnionArray(arr1,arr2,m,n);
        for (int i : s1)
        {
            System.out.print(i +" ");
        }
    }
}
