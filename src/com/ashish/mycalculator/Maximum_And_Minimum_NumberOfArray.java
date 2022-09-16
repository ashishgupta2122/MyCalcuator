package com.ashish.mycalculator;
import java.util.*;
import java.util.Collections;
public class Maximum_And_Minimum_NumberOfArray {
    public static void main(String[] args)
    {
        Integer arr[] = {12,45,67,85,24};
        int max = Collections.max(Arrays.asList(arr));
        int min = Collections.min(Arrays.asList(arr));

        System.out.println("The Maximum Number of Arrays "+max);
        System.out.println("The Minumum Number of Arrays "+min);

    }
}
