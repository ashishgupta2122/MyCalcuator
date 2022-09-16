package com.ashish.mycalculator;
import java.util.*;
public class FindMinimum_inRotatedAnd_Sorted {
    public static void main(String[] args)
    {
        Integer arr[] = {3,4,5,1,2};
        Arrays.sort(arr);

        int min = Collections.min(Arrays.asList(arr));
        System.out.println("The Minimum Numbers of Array "+min);
    }
}
