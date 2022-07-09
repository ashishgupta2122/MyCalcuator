package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Minimum_Number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter The Number");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        System.out.println("The Minimum Number of Array");
        for (int i = 0; i < n; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
