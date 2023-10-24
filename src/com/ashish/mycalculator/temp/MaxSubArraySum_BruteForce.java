package com.ashish.mycalculator.temp;
import java.util.*;
public class MaxSubArraySum_BruteForce {
    public static void SubArray(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            int start = i;
            for (int j = i; j < arr.length; j++){
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++){
                    currsum += arr[k];
                }
                if (currsum > maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum Number of SubArray "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        SubArray(arr);
    }
}
