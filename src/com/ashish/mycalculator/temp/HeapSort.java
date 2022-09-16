package com.ashish.mycalculator.temp;
import java.util.*;
public class HeapSort {
    public static void Heapify(int arr[],int n,int i)
    {
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;

        if (left <= n && arr[left] > largest)
        {
            largest = left;
        }
        if (right <= n && arr[right] > largest)
        {
            largest = right;
        }
        if (largest != i)
        {
            int temp = i;
            i = largest;
            largest = temp;
            Heapify(arr,n,largest);
        }
    }
    public static void buildheap(int arr[],int n)
    {
        for (int i = n/2; i > 0; i--)
        {
            Heapify(arr,n,i);
        }
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {12,11,13,5,6,7};
        int n = arr.length;

        HeapSort s1 = new HeapSort();
        s1.buildheap(arr,n);

        System.out.println("Sorted Array");
        printArray(arr);
    }
}
