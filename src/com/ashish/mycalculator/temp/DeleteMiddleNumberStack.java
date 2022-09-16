package com.ashish.mycalculator.temp;
import java.util.*;
public class DeleteMiddleNumberStack {
    public static void main(String[] args)
    {
        Stack<Integer> s1 = new Stack<>();
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++)
        {
            s1.push(arr[i]);
        }
        int[] delete = new int[n];
        for (int i = 0; i < n; i++)
        {

        }
        System.out.println("The Middle Number of Delete "+ans);
    }
}
