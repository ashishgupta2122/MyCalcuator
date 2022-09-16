package com.ashish.mycalculator.temp;
import java.util.*;
public class NRopesMinimum {
    public static int Min(int arr[])
    {
        PriorityQueue<Integer> s1 = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++)
        {
            s1.add(arr[i]);
        }
        int ans = 0;
        while (s1.size() > 1)
        {
            int first = s1.poll();
            int second = s1.poll();
            int sum = first + second;
            ans += sum;
            s1.add(sum);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {4,3,2,6};
        System.out.println("The Minimum Numbers of "+Min(arr));
    }
}