package com.ashish.mycalculator;
import java.util.*;
public class ConnectNRopes_ofMimimumNumber {
    public static int Minimum(int arr[])
    {
        PriorityQueue<Integer> s1 = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++)
        {
            s1.add(arr[i]);
        }
        int sum = 0;
        while (s1.size() > 1)
        {
            int first = s1.poll();
            int second = s1.poll();
            sum = first + second;
            s1.add(sum);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int arr[] = {2,5,4,8,6,9};
        System.out.println("Total cost for connecting roops is "+Minimum(arr));
    }
}
