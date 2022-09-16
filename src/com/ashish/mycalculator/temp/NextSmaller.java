package com.ashish.mycalculator.temp;
import java.util.*;
public class NextSmaller {
    public static void Next(int arr[],int n)
    {
        Stack<Integer> s1 = new Stack<>();
        for (int i = n-1; i >= 0; i--)
        {
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
    }
    public static void main(String[] args) {
        int arr[] = {3,10,5,1,15,10,7,6};
        int n = arr.length;
        Next(arr,n);
    }
}
