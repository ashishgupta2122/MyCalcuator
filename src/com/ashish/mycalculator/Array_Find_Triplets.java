package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Find_Triplets {
    public static boolean Array_Triplets(int arr[],int n,int sum)
    {
        int numpairs = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                for (int k = j + 1; k < arr.length; k++)
                {
                    if (arr[i] + arr[j] + arr[k] == sum)
                    {
                        System.out.println("Triplets is " + arr[i] + ", " + arr[j] + ", " + arr[k] + ", ");
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,4,45,6,10,8};
        int n = arr.length;
        System.out.println(Array_Triplets(arr,n,22));
    }
}

//Output
//Triplets is 4, 10, 8,
//true