package com.ashish.mycalculator.temp;
import java.util.*;
public class MajorityNumberArray {
    public static void Majority(int arr[])
    {
        int ansIndex = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] == ansIndex)
            {
                count++;
            }
            else
            {
                count--;
            }
            if (count == 0)
            {
                ansIndex = i;
                count = 1;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {5,1,4,1,1};
        System.out.println("Majority Number of Array");
        Majority(arr);
    }
}
