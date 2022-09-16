package com.ashish.mycalculator.temp;
import java.util.*;
public class KthLargestNumberArray {
    public static int Kthlargest(int arr[],int k)
    {
        PriorityQueue<Integer> s1 = new PriorityQueue<>();
        for (int i = 0; i < k; i++)
        {
            s1.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++)
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
        System.out.println("Kth Largest Number of Array "+Kthlargest(arr,key));
    }
}
