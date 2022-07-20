package com.ashish.mycalculator;
import java.util.Scanner;
public class Push_Zero_Array {
    public static void main(String[] arga)
    {
        int arr[] = {2,6,0,0,1,9,0,8,0};
        int nonzero = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[nonzero];
                arr[nonzero] = temp;
                nonzero++;
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
