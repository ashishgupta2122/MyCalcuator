package com.ashish.mycalculator;
import java.util.Arrays;
public class LearnArrayClass {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5,6,7,8,9,10};//Here In this fuction are work,when arr is sorted.
        //int index = Arrays.binarySearch(arr,8);
        //System.out.println("The Index of Element 8 is "+index);

        //Ab Array ko Kaise Sort kare function method se
        int arr[] = {90,80,70,45,68,42,57,75};
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] +" ");
        }
        //Ab Ham Binary search karke check karte hai
        int index = Arrays.binarySearch(arr,70);
        System.out.println("The Index of Element is "+index);
    }
}
