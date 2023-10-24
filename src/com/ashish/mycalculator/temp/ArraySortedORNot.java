package com.ashish.mycalculator.temp;
import java.util.*;
public class ArraySortedORNot {
    public static Boolean Sorted(int arr[],int i) {
        //base case recusive Approach
        if(i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return Sorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Sorted(arr,0));
    }
}
