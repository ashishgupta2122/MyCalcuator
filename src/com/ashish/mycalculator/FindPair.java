package com.ashish.mycalculator;
import java.util.*;
public class FindPair {
    public static void Pair(int arr[],int sum)
    {
        int currsum = 0;
        int start = 0;
        int end = -1;

        HashMap<Integer,Integer> s1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            currsum += arr[i];
            if (currsum - sum == 0)
            {
                start = 0;
                end = i;
                break;
            }
            if (s1.containsKey(currsum - sum))
            {
                start = s1.get(currsum - sum) + 1;
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
            System.out.println(start +" "+end);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 8, 30, 40, 100};
        int sum = -60;
        Pair(arr,sum);
    }
}