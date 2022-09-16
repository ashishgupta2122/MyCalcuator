package com.ashish.mycalculator;
import java.util.*;
public class CyclicallyRotateArray {
    public static void Rotate(int arr[])
    {
        int i = 0;
        int j = arr.length - 1;
        while (i != j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        System.out.println("Given Array is");
        System.out.print(Arrays.toString(arr));

        Rotate(arr);

        System.out.println("Rotated Array is");
        System.out.print(Arrays.toString(arr));
    }
}
