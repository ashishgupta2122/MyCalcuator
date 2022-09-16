package com.ashish.mycalculator.temp;
import java.util.*;
public class IntersectionOfTwoArray {
    public static int Intersection(int arr1[],int arr2[])
    {
        HashSet<Integer> s1 = new HashSet<>();
        int count = 0;
        for (int element : arr1)
        {
            s1.add(element);
        }
        for (int element : arr2)
        {
            if (s1.contains(element))
            {
                count++;
                s1.remove(element);
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr1[] = {5,10,15,5,10};
        int arr2[] = {15,10,4};
        System.out.println("Intersection of two Array "+Intersection(arr1,arr2));
    }
}
