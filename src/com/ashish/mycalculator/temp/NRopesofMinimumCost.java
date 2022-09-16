package com.ashish.mycalculator.temp;
import java.util.*;
public class NRopesofMinimumCost {
    public static int Min(int arr[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++)
        {
            pq.add(arr[i]);
        }
        int ans = 0;
        while (pq.size() > 1)
        {
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            ans += sum;
            pq.add(sum);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {2,5,4,8,6,9};
        System.out.println("Minimum Cost of N Ropes "+Min(arr));
    }
}
