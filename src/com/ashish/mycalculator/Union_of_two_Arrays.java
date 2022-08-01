package com.ashish.mycalculator;
import java.util.*;
public class Union_of_two_Arrays {
    public static int Union(int a[],int b[])
    {
        Set<Integer> set = new HashSet<>();
        for (int x : a)
        {
            set.add(x);
        }
        for (int x : b)
        {
            set.add(x);
        }
        return set.size();
    }
    public static void main(String[] args)
    {
        int a[] = {5,10,15,5};
        int b[] = {10,15,5};
        System.out.println(Union(a,b));
    }
}
