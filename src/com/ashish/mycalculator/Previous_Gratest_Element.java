package com.ashish.mycalculator;
import java.util.*;
public class Previous_Gratest_Element {
    public static void gratest(int arr[])
    {
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < arr.length; i++)
        {
            while (!s1.isEmpty() && s1.peek() <= arr[i])
            {
                s1.pop();
            }
            if (s1.isEmpty())
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
        int arr[] = {4,10,5,18,3,12,7};
        gratest(arr);
    }
}
