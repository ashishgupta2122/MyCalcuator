package com.ashish.mycalculator;
import java.util.*;
public class Arrays_Reverse {
    static void reverse(Integer myArray[])
    {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }

    public static void main(String[] args)
    {
        Integer [] myArray = {1,3,5,7,9};
        System.out.println("Original Array:" + Arrays.asList(myArray));
        reverse(myArray);
    }
}
