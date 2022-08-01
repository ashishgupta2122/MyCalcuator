package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Boundary_Sum {
    public static long getBoundarySum(int arr[][],int m,int n)
    {
        long sum = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == 0)
                {
                    sum += arr[i][j];
                }
                else if(i == m - 1)
                {
                    sum += arr[i][j];
                }
                else if (j == 0)
                {
                    sum += arr[i][j];
                }
                else if(j == n - 1)
                {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row");
        int m = sc.nextInt();
        System.out.println("Enter Thw Col");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter The Element in Array");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j]  = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        long sum = getBoundarySum(arr,m,n);
        System.out.println("The Sum of Array Boundary "+sum);
    }
}
