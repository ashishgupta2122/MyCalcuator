package com.ashish.mycalculator.temp;
import java.util.*;
public class KthLargestElementStream {
    public static Integer[] Largest(int[] arr, int n, int key)
    {
        Integer[] ans = new Integer[n];
        PriorityQueue<Integer> s1 = new PriorityQueue<>();
        for (int i = 0; i < n; i++)
        {
            if (s1.size() < key)
            {
                s1.add(arr[i]);
            }
            else if (arr[i] < s1.peek())
            {
                s1.remove();
                s1.add(arr[i]);
            }
            if (s1.size() < key)
            {
                ans[i] =  -1;
            }
            else {
                ans[i] = s1.peek();
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int key = 4;
        Integer[] v = Largest(arr,n,key);
        for (int it : v){
            System.out.print(it+ " ");
        }
    }
}
