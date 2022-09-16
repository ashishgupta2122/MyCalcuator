package com.ashish.mycalculator.temp;
import java.util.*;
public class AreaOfHistogram {
    public static int[] PreviosSmaller(int[] arr, int n)
    {
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < arr.length; i++)
        {
            s1.add(arr[i]);
            while (!s1.empty() && s1.peek() >= arr[i])
            {
                s1.pop();
            }
            if (s1.empty())
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(s1.peek());
            }
            s1.push(arr[i]);
        }
        return arr;
    }
    public static void NextSmaller(int arr[],int n)
    {
        Stack<Integer> s1 = new Stack<>();
        for (int i = n; i >= 0; i--)
        {
            s1.add(arr[i]);
            while (!s1.empty() && s1.peek() <= arr[i])
            {
                s1.pop();
            }
            if (s1.empty())
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(s1.peek());
            }
            s1.push(arr[i]);
        }
    }
   //incomplete
    public static void main(String[] args)
    {
        int arr[] = {4,2,1,5,6,3,2,4,2};
        int n = arr.length;

    }
}
