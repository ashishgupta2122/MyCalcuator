package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Sum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter The Element");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        System.out.println("The Sum of Array Number");
        for (int i = 0; i < n; i++)
        {
            ans = ans + arr[i];
        }
        System.out.println(ans +" ");

    }
}
