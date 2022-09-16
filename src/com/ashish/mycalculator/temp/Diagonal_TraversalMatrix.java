package com.ashish.mycalculator.temp;
import java.util.*;
public class Diagonal_TraversalMatrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int k = 0; k < arr.length; k++)
        {
            for (int i = 0, j = k; j < arr.length; i++,j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
