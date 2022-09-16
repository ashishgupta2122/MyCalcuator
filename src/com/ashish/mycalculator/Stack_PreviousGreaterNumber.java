package com.ashish.mycalculator;
import java.util.Stack;
public class Stack_PreviousGreaterNumber {
    public static void previousgreater(int arr[])
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
    public static void main(String[] args)
    {
        int arr[] = {10, 4, 2, 20, 40, 12, 30};
        previousgreater(arr);
    }
}
