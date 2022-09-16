package com.ashish.mycalculator;
import java.util.*;
public class Array_Average_Number {
    //Write a Java program to calculate the average value of array elements.
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        float average = (sum)/ arr.length;
        System.out.println("The Average Number of Array "+average);
    }
}
