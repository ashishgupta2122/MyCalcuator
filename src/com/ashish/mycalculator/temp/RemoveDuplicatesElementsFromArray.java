package com.ashish.mycalculator.temp;
import java.util.*;
public class RemoveDuplicatesElementsFromArray {
    public static int Duplicates(int arr[],int n) {
        //base case
        if(n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i+1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[n-1];//last number
        j++;
        return j;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;

        n = Duplicates(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
