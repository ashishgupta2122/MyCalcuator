package com.ashish.mycalculator.temp;
import java.util.*;
public class ReverseArrayGroup {
    public static void Recerse(int arr[],int k,int n){
        for(int i = 0; i < n; i+=k){
            int left = i;
            int right = Math.min(i+k-1, n-1);
            while (left < right){
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
               left += 1;
               right -= 1;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 3;
        int n = arr.length;

        Recerse(arr,k,n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
