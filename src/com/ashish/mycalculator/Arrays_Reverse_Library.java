package com.ashish.mycalculator;
import java.util.*;
import java.util.Collections;
public class Arrays_Reverse_Library {
    public static void reverse(Integer[] arr)
    {
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
    public static void main(String[] args)
    {
        Integer[] arr = {12,34,56,89,64,39};
        reverse(arr);
    }
}
