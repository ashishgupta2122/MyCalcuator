package com.ashish.mycalculator;
import java.util.Arrays;
import java.util.Collections;
public class Print_Kth_Largest_Number {
    public static int kthlargest(int arr[],int k)
    {
        //Here Sabse Pahle Array ko Sort karo
        Arrays.sort(arr);
        //ab return karo kth element ko
        return arr[k];
    }
    public static void main(String[] args) {
        int arr[] = {20,10,60,30,50,40};
        int k = 3;
        System.out.println("The Kth Largest Element "+kthlargest(arr,k));
    }
}
