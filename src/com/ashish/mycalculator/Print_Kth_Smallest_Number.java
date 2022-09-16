package com.ashish.mycalculator;
import java.util.Arrays;
import java.util.Collections;
public class Print_Kth_Smallest_Number {
    public static int kthSmallest(int arr[],int k)
    {
        //sort
        Arrays.sort(arr);
        //return kth element in sorted arrays
        return arr[k - 1];
    }
    public static void main(String[] args) {
        int arr[] = {45,68,42,75,44,67,53};
        int k = 3;
        System.out.println("The Kth Smallest Number "+kthSmallest(arr,k));
    }
}
