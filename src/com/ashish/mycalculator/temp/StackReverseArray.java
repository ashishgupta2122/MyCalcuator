package com.ashish.mycalculator.temp;
import java.util.*;
public class StackReverseArray {
    public static void main(String[] args)
    {
        Stack<Integer> s1 = new Stack<>();
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            s1.add(arr[i]);
        }
        int[] reverse = new int[n];
        for (int i = 0; i < n; i++)
        {
            reverse[i] = s1.pop();
        }
        System.out.println("Reverse Array "+Arrays.toString(reverse));
    }
}