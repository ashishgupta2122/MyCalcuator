package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Predict4_Multiple_choice {
    public static int fun(int[][] arr2d)
    {
        int sum = 0;
        for (int i = 0; i < arr2d.length; i++)
        {
            for (int j = 0; j < arr2d[i].length; j++)
            {
                sum += arr2d[i][j];
            }
        }
        return sum;
    }
    public static void main(String [] args)
    {
        int arr[][] = {{0,1,2,4,5},{3,4,5,6,7},{5,6,7,8,9}};
        System.out.println(fun(arr));
    }
}
