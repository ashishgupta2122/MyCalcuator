package com.ashish.mycalculator.temp;
import java.util.*;
public class PrintSubArrays1 {
   public static void printArray(int arr[]){
       for (int i = 0; i < arr.length; i++){
           int start = i;
           for (int j = i; j < arr.length; j++){
               int end = j;
               for (int k = start; k <= end; k++){
                   System.out.print(arr[k]+" ");
               }
               System.out.println();
           }
           System.out.println();
       }
   }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10};
        printArray(arr);
    }
}
