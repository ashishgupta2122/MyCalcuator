package com.ashish.mycalculator;
import java.util.*;
public class Majority_Element_in_Array {
    public static void Array(int arr[],int n)
    {
        int ansIndex = 0;
        int count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[ansIndex])
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
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == ansIndex)
            {
                count++;
            }
            if (count > (n / 2))
            {
                System.out.println(ansIndex);
            }
            else
            {
                System.out.println("Majority Element is not Present");
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,1};
        int n = arr.length;
        Array(arr,n);
    }
}
