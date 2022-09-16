package com.ashish.mycalculator.temp;
import java.util.*;
public class KthSmallestNumberArray {
    public static int KthSmallest(int arr[],int key)
    {
        PriorityQueue<Integer> s1 = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < key; i++)
        {
            s1.add(arr[i]);
        }
        for (int i = key; i < arr.length; i++)
        {
            if (s1.peek() < arr[i])
            {
                s1.poll();
                s1.add(arr[i]);
            }
        }
        return s1.peek();
    }
    public static void main(String[] args)
    {
        int arr[] = {20,10,60,30,50,40};
        int key = 3;
        System.out.println("Kth Smallest Number of Array "+KthSmallest(arr,key));
    }
}
