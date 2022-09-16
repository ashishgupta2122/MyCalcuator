package com.ashish.mycalculator.temp;
import java.util.*;
public class PreviousSmallerElement {
    public static void Previous(int arr[])
    {
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < arr.length; i++)
        {
            s1.add(arr[i]);
            while (!s1.isEmpty() && s1.peek() >= arr[i])
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
    public static void main(String[] args)
    {
        int arr[] = {4,10,5,8,20,15,3,12};
        System.out.println("Previous Smaller Number in Array ");
        Previous(arr);
    }
}
