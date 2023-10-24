package com.ashish.mycalculator.temp;
import java.util.*;
public class FirstOccuranceOfArray {
    public static int Occur(int arr[],int k){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] == k){
                ans = mid;
                end = mid - 1;
            }else if(k > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,5};
        int k = 3;
        System.out.println("First Ocuurance of Array "+Occur(arr,k));
    }
}
