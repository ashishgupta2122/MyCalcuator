package com.ashish.mycalculator;
import java.util.Scanner;
public class Print_Pair_Array {
    public static void printAllPairs(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                System.out.println("(" +arr[i] + "," + arr[j] +")");
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6};
        printAllPairs(arr);
    }
}
//(1,2)
//(1,3)
//(1,4)
//(1,5)
//(1,6)
//(2,3)
//(2,4)
//(2,5)
//(2,6)
//(3,4)
//(3,5)
//(3,6)
//(4,5)
//(4,6)
//(5,6)

