package com.ashish.mycalculator;
import java.util.*;
public class N_Ropes_with_Minmum_cost {
    public static int mincost(int arr[])
    {
        PriorityQueue<Integer> l1 = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++)
        {
            l1.add(i);
        }
        int ans = 0;
        while (l1.size() > 1)
        {
            int first = l1.poll();
            int second = l1.poll();
            int sum = first + second;
            ans += sum;
            l1.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,4,8,6,9};
        System.out.println(mincost(arr));
    }
}
