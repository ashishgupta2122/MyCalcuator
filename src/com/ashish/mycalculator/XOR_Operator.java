package com.ashish.mycalculator;
import java.util.Scanner;
public class XOR_Operator {
    public static void main(String[] args)
    {
        int arr[] = {5,4,1,4,3,5,1};
        int ans = 0;
        for (int i = 0; i < arr.length; i++)
        {
            ans = arr[i] ^ ans;
        }
        System.out.println(ans+" ");
    }
}
