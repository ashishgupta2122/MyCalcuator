package com.ashish.mycalculator;
import java.util.*;
public class PassByValue {
    static void swap(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int c = 23;
        int d = 32;
        swap(c,d);
        System.out.println(c +" " + d);
    }
}
