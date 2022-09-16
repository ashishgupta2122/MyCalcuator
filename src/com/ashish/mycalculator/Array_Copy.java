package com.ashish.mycalculator;
import java.util.Arrays;
public class Array_Copy {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = new int[5];

        System.out.print("Source Array "+Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }
        System.out.print("Duplicate Array "+Arrays.toString(arr2));
    }
}
