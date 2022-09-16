package com.ashish.mycalculator;
import java.util.*;
public class Find_K_closestElements {
    public static List<Integer>findKthClosetElement(int arr[],int k,int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while (right - left >= k)
        {
            if (Math.abs(arr[left] - target) > Math.abs(arr[right] - target))
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return Arrays.stream(arr, left, right+1).boxed().toList();
    }
    public static void main(String[] args)
    {
        int arr[] = {12,16,22,30,35,39,42,45,48,50,53,55,56};
        int k = 4;
        int target = 35;
        System.out.println(findKthClosetElement(arr,k,target));
    }
}