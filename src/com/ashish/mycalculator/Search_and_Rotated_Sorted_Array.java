package com.ashish.mycalculator;
import java.util.Scanner;
public class Search_and_Rotated_Sorted_Array {
    public static int Pivot(int arr[],int n)
    {
        int start = 0;
        int end = n - 1;
        while(start < end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[0])
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
            mid = start + (end - start)/2;
        }
        return start;
    }
    public static int Binary_Search(int arr[],int s,int e,int key)
    {
        int start = s;
        int end = e;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (key > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return start;
    }
    public static int find_Position(int arr[],int n,int key)
    {
        int pivot = Pivot(arr,5);
        if (key >= arr[pivot] && key <= arr[n-1])
        {
            return Binary_Search(arr,pivot,n-1,key);
        }
        else
        {
            return Binary_Search(arr,0,pivot - 1,key);
        }
    }
    public static void main(String [] args)
    {
        int arr[] = {12,15,18,2,4};
        System.out.println("The Search and Rotated Number "+find_Position(arr,5,18));
    }
}