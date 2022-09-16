package com.ashish.mycalculator;
import java.util.*;
public class Kth_largest_Number {
    public static int Peek(int arr[],int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(arr);
        for (int i = 0; i < k; i++)
        {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++)
        {
            if (pq.peek() < arr[i])
            {
                pq.poll();
                pq.add(arr[i]);
            }
            System.out.println(arr[i]);
        }
        return pq.peek();
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 4;
        Peek(arr,k);
    }
}