package com.ashish.mycalculator.temp;
import java.util.*;
public class KthSortedArrays {
    public static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Arrays.sort(arr,0,3);
        PrintArray(arr);
    }
}
