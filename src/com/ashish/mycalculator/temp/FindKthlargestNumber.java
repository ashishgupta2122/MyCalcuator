package com.ashish.mycalculator.temp;
import java.util.*;
public class FindKthlargestNumber {
    public static int largest(Integer[] arr,int key)
    {

        Stack<Integer> s1 = new Stack<>();
        Arrays.sort(arr);
        for (int i = 0; i < key; i++)
        {
            s1.add(arr[i]);
        }
        for (int i = key+1; i < arr.length; i++)
        {
            if (s1.peek() < arr[i])
            {
                s1.pop();
                s1.add(arr[i]);
            }
            System.out.print(arr[i]+" ");
        }
        return s1.peek();
    }
    public static void main(String[] args)
    {
        Integer[] arr = {1, 23, 12, 9, 30, 2, 50};
        int key = 3;
        largest(arr,key);
    }
}