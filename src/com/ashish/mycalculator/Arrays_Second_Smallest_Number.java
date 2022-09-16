package com.ashish.mycalculator;
import java.util.*;
public class Arrays_Second_Smallest_Number {
    public static void main(String[] args)
    {
        int arr[] = {12,34,56,2,34,58};
        System.out.println("Original Arrays : "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Smallest Array Element : "+arr[0]);
        System.out.println("Second Smallest Array Element : "+arr[1]);

    }
}
