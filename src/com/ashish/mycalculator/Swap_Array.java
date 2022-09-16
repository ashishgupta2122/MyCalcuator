package com.ashish.mycalculator;
import java.util.Scanner;
public class Swap_Array {
    public static void main(String[] args)
    {
        int arr[] = {12,10,9,45,2,10,10,45};
        int n = arr.length;
        System.out.println("Swapping Array");
        //Here,i+=2 means incerment of one index
        for (int i = 0; i < n; i+=2)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
//1 2 3 9 15 10