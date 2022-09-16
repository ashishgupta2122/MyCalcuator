package com.ashish.mycalculator.temp;
import java.util.*;
public class SubArraySum {
    public static void Sub(int arr[],int sum)
    {
        HashMap<Integer,Integer> s1 = new HashMap<>();
        int currsum = 0;
        int start = 0;
        int end = -1;
        for (int i = 0; i < arr.length; i++)
        {
            currsum += arr[i];
            if ((currsum - sum) == 0)
            {
                start = 0;
                end = i;
                break;
            }
            if (s1.containsKey(currsum - sum))
            {
                start = s1.get(currsum - sum)+1;
                end = i;
                break;
            }
            s1.put(currsum,i);
        }
        if (end == -1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println(start+" "+end);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {10,15,-5,15,-10,5};
        int sum = 20;
        Sub(arr,sum);
    }
}