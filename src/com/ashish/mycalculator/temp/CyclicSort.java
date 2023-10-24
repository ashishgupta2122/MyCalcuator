package com.ashish.mycalculator.temp;
import java.util.*;
public class CyclicSort {
    public static void Swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void Cyclic(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                Swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}
