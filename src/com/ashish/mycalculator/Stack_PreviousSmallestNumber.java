package com.ashish.mycalculator;
import java.util.Stack;
public class Stack_PreviousSmallestNumber {
    public static void previous(int arr[])
    {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++)
        {
            while (! s.isEmpty() && s.peek() >= arr[i])
            {
                s.pop();
            }
            if (s.isEmpty())
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(s.peek());
            }
            s.push(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        //Stack<Integer> s = new Stack<>();
        int arr[] = {2, 5, 3, 7, 8, 1, 9};
        previous(arr);
    }
}
