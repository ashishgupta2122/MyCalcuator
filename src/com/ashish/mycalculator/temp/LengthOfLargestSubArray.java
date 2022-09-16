package com.ashish.mycalculator.temp;
import java.util.*;
public class LengthOfLargestSubArray {
    public static void main(String[] args)
    {
        Integer[] arr = {10,12,11};
        int max = Collections.max(Arrays.asList(arr));
        int min = Collections.min(Arrays.asList(arr));
        int ans = max - min;
        System.out.println("Length of the Longest Contiguous subarray is "+ans);
    }
}
