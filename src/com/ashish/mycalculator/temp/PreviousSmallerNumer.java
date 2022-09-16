package com.ashish.mycalculator.temp;
import java.util.*;
public class PreviousSmallerNumer {
    public static void PrintNSE(int arr[],int n)
    {
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < n; i++)
        {
            while (!s1.empty() && s1.peek() >= arr[i])
            {
                s1.pop();
            }
            if (s1.empty())
            {
                System.out.println(-1);
            }
            else {
                System.out.println(s1.peek());
            }
            s1.push(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {4,10,5,18,3,12,7};
        int n = arr.length;
        System.out.println("Previous Number of Array ");
        PrintNSE(arr,n);
    }
}