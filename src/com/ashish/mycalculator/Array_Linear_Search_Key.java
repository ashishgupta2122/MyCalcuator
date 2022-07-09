package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Linear_Search_Key {
    public static int linear_Search(int arr[],int n,int key)
    {
        for (int i = 0; i < n; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
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
        System.out.println(linear_Search(arr,n,12));

    }
}
