package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Largest_Col_Sum {
    public static int[][] Array()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row");
        int m = sc.nextInt();
        System.out.println("Enter The Col");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter The Element in Array");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static int largest(int arr[][])
    {
        int m = arr.length;
        int n = arr[0].length;
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++)
        {
            int sum = 0;
            for (int i = 0; i < m; i++)
            {
                sum += arr[i][j];
            }
            if (sum > max)
            {
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int arr[][] = Array();
        int colSum = largest(arr);
        System.out.println("The Largest Col Sum "+colSum);
    }
}