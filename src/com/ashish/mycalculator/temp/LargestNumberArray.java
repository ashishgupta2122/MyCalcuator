package com.ashish.mycalculator.temp;
import java.util.*;
public class LargestNumberArray {
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,58};
        System.out.println("Largest Number of Array "+getLargest(arr));
    }
}
