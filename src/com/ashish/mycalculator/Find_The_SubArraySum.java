package com.ashish.mycalculator;
import java.util.*;
public class Find_The_SubArraySum {
    public static void subArray(int[] a, int sum)
    {
        int currsum = 0;
        int start = 0;
        int end = -1;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++)
        {
            currsum += a[i];
            if (currsum - sum == 0)
            {
                start = 0;
                end = 1;
                break;
            }
            if(map.containsKey(currsum - sum))
            {
                start = map.get(currsum - sum) + 1;
                end = i;
                break;
            }
            map.put(currsum,i);
        }
        if (end == -1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println(start +" "+end);
        }
    }
    public static void main(String[] args) {
        int[] a = {10,15,-5,15,-10,5};
        subArray(a,20);
    }
}
