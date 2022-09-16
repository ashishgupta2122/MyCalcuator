package com.ashish.mycalculator;
import java.util.*;
public class Recursive_Factorial {
    public static int factorial(int n)
    {
        if (n == 0 && n == 1)
        {
            return 1;
        }
        else
        {
            return n + factorial(n - 1);
        }
    }
    public static void main(String[] args)
    {
        int n = 3;
        factorial(n);
    }
}