package com.ashish.mycalculator;
import java.util.*;
public class Heapsort_Heapify {
    public static void Sort(int arr[])
    {
        Arrays.sort(arr);
    }
    public static void Heap(Integer[] arr,int n,int i)
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
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
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
        int arr[] = {40,10,30,50,60,15};
        int n = arr.length;
        Heapsort_Heapify s1 = new Heapsort_Heapify();
        s1.Sort(arr);
        System.out.println("Sorted Arrays");
        printArray(arr);
    }
}