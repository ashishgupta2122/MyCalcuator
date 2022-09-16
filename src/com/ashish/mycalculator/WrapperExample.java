package com.ashish.mycalculator;
import java.util.*;
public class WrapperExample {
    public static void swap(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args)
    {
        int a = 10;
        int b = 12;

        swap(a,b);

        System.out.print(a +" "+ b);
    }
}
