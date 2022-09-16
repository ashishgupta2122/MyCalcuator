package com.ashish.mycalculator.temp;
import java.util.*;
public class RecusionPower {
    public static int Power(int a,int b)
    {
        if (b == 0)
        {
            return 1;
        }
        return a * Power(a,b - 1);
    }
    public static void main(String[] args)
    {
        int a = 3;
        int b = 2;
        System.out.println("The Power of Number "+Power(a,b));
    }
}