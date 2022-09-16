package com.ashish.mycalculator.temp;
import java.util.*;
public class RecursionUsingPrint {
    public static void Print(int n)
    {
        if (n == 0)
        {
            return;
        }
        System.out.println("Hello");
        Print(n - 1);
    }
    public static void main(String[] args)
    {
        int n = 4;
        Print(n);
    }
}
