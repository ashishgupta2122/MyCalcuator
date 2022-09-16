package com.ashish.mycalculator;
import java.util.*;
public class KthSmallestNumberArray {
    public static int Smallest(int arr[],int key)
    {
        Arrays.sort(arr);

        return arr[key - 1];
    }
    public static void main(String[] args)
    {
        int arr[] = {7,10,4,3,20,15};
        int key = 3;
        System.out.println("Kth Smallest Number of "+Smallest(arr,key));
    }
}
