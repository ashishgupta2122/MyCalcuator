package com.ashish.mycalculator.temp;
import java.util.*;
public class CountDistictElement {
    public static int Count(int arr[])
    {
        HashSet<Integer> s1 = new HashSet<>();
        for (int element : arr)
        {
            s1.add(element);
        }
        return s1.size();
    }
    public static void main(String[] args) {
        int arr[] = {5,10,15,5,4,5};
        System.out.println("Count Distinct Elements "+Count(arr));
    }
}
