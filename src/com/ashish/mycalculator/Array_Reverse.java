package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Reverse {
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50};
        for (int i = 0; i< arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.print(arr[i] +" ");
        }
    }
}
