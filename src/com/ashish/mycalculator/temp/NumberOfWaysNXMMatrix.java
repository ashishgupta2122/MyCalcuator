package com.ashish.mycalculator.temp;
import java.util.*;
public class NumberOfWaysNXMMatrix {
    public static int Count(int n,int m)
    {
        if (n == 1 || m == 1)
        {
            return 1;
        }
        return Count(n - 1,m) + Count(n,m - 1);
    }
    public static void main(String[] args)
    {
        int n = 4;
        int m = 3;
        System.out.println("The Count of N X M Matrix "+Count(n,m));
    }
}