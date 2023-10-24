package com.ashish.mycalculator.temp;
import java.util.*;
public class Permutation {
    public static void permute(int arr[],int l,int r) {
        if (l == r) {
            print(arr);
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(arr,i,l);
            permute(arr,l+1,r);
            swap(arr,i,l);
        }
    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    //swap function
    public static void swap(int arr[],int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        permute(arr,0, arr.length-1);
    }
}
