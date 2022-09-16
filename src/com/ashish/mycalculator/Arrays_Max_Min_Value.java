package com.ashish.mycalculator;
import java.util.Arrays;
import java.util.Collections;

public class Arrays_Max_Min_Value {
    public static void main(String[] args) {
        Integer[] num = { 2, 4, 7, 5, 9 };

        // using Collections.min() to
        // find minimum element
        // using only 1 line.
        int min = Collections.min(Arrays.asList(num));

        // using Collections.max()
        // to find maximum element
        // using only 1 line.
        int max = Collections.max(Arrays.asList(num));

        // printing minimum and maximum numbers
        System.out.println("Minimum number of array is : "
                + min);
        System.out.println("Maximum number of array is : "
                + max);
    }
}
