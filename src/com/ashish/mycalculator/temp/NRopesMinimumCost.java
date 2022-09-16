package com.ashish.mycalculator.temp;
import java.util.*;
public class NRopesMinimumCost {
    public static int MinCost(int arr[])
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
        int arr[] = {2,5,4,8,6,9};
        System.out.println("N Ropes of Minimums Cost "+MinCost(arr));
    }
}
