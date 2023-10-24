package com.ashish.mycalculator.temp;
import java.util.*;
public class CountPair {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            int Current = arr[i];
            for (int j = i+1; j < arr.length; j++){
                count++;
            }
        }
        System.out.println("Total Pairs of Array "+count);
    }
}
