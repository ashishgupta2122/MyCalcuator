package com.ashish.mycalculator.temp;
import java.util.*;
public class MajorityElementArray {
    public static int Majority(int arr[],int n)
    {
        int ans = -1;
        HashMap<Integer,Integer> s1 = new HashMap();
        for (int i = 0; i < n; i++)
        {
            if (s1.containsKey(arr[i]))
            {
                s1.put(arr[i],s1.get(arr[i])+1);
            }
            else
            {
                s1.put(arr[i],1);
            }
            if (s1.get(arr[i]) > n/2)
            {
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {2,2,1,1,1,2,2};
        int n = arr.length;
        System.out.println("Majority Elements of Array "+Majority(arr,n));
    }
}
