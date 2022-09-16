package com.ashish.mycalculator;
import java.util.*;
public class Duplicate_Number_Arrays {
    public static void main(String[] args) {
        int arr[] = {5,2,7,7,5};
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j] && i != j)
                {
                    System.out.println("Duplicate Element : "+arr[j]);
                }
            }
        }
    }
}
