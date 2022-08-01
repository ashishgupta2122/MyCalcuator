package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Print_Wave_Form {
    public static void Array(int arr[][],int m,int n)
    {
        for (int j = 0; j < n; j++)
        {
            if (j % 2 == 0)
            {
                for (int i = 0; i < m; i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for (int i = m - 1; i >= 0; --i)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row");
        int m = sc.nextInt();
        System.out.println("Enter The Col");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter The Element in the Array");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
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
        System.out.println("The Wave Form of Print Array");
        Array(arr,m,n);
    }
}