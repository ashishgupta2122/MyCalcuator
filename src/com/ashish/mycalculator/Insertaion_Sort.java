package com.ashish.mycalculator;
import java.util.Scanner;
public class Insertaion_Sort {
    public static void  main(String[] args)
    {
        int arr[] = {10,1,7,4,8,2,11};
        for (int i = 0; i < arr.length; i++)
        {
            int temp = arr[i];
            int j = i-1;
            for (; j >= 0; j--)
            {
                if (arr[j] > temp)
                {
                    arr[j+1] = arr[j];
                }
                else
                {
                    break;
                }
            }
            arr[j+1] = temp;
        }
        System.out.println("Insertation Sort");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
