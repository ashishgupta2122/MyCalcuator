package com.ashish.mycalculator;
import java.util.*;
public class QuickSort {
    public static int partition(int arr[],int l,int h)
    {
        int pivot = arr[l];
        int i = l;
        int j = h;

        while (i < j)
        {
            while (arr[i] <= pivot)
            {
                i++;
            }
            while (arr[j] > pivot)
            {
                j--;
            }
            if (i < j)
            {
                swap(arr,i,j);
            }
            swap(arr,j,l);
        }
        return j;
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void Quick(int l,int h)
    {
        if (l < h)
        {

        }
    }
    public static void main(String[] args) {

    }
}
