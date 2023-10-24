package com.ashish.mycalculator.temp;
import java.util.*;
public class MissingNumberArray {
    public static int Missing(int arr[]){
        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length){
            if(arr[i] < arr.length && arr[i] != i){
                return i;
            }else{
                i++;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int arr[] = {0,1};
        Missing(arr);
        System.out.println("The Missing Number of Array "+Missing(arr));
    }
}
