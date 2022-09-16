package com.ashish.mycalculator.temp;
import java.util.*;
public class Diagonal2_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row");
        int r = sc.nextInt();
        System.out.println("Enter The Col");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter The Element in Matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Traversal Matrix");
        for (int i = 0; i < r + c - 1; i++)
        {
            for (int j = 0; j < r; j++)
            {
                for (int k = 0; k < c; k++)
                {
                    if (j + k == i)
                    {
                        if (i % 2 == 0)
                        {
                            System.out.print(arr[k][j]+" ");
                        }
                        System.out.print(arr[j][k]+" ");
                    }
                }
            }
        }
    }
}
