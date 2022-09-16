package com.ashish.mycalculator.temp;
import java.util.*;
public class UnionOfTwoArray {
    public static int Union(int arr1[],int arr2[])
    {
        HashSet<Integer> s1 = new HashSet<>();
        for (int element : arr1)
        {
            s1.add(element);
        }
        for (int element : arr2)
        {
            s1.add(element);
        }
        return s1.size();
    }
    public static void main(String[] args)
    {
        int arr1[] = {5,10,15,5,4,5};
        int arr2[] = {10,15,4,5};
        System.out.println("The Union of Two Array "+Union(arr1,arr2));
    }
}
