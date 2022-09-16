package com.ashish.mycalculator;
import java.util.*;
import java.util.Set;
public class Find_The_SubArraySum {
    public static void SubArray(int arr[],int sum)
    {
        int Currsum = 0;
        int start = 0;
        int end = -1;

        HashMap<Integer,Integer> sc = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            Currsum += arr[i];
            if (Currsum == sum)
            {
                start = 0;
                end = i;
                break;
            }
            if (sc.containsKey(Currsum - sum))
            {
                start = sc.get(Currsum - sum)+1;
                end = i;
                break;
            }
            sc.put(Currsum,i);
        }
        if (end == -1)
        {
            System.out.println("Element are not found");
        }
        else
        {
            System.out.println(start+" "+end);

        }
    }
    public static void main(String[] args)
    {
        int arr[] = {10,15,-5,15,-10,5};
        SubArray(arr,20);
    }
}