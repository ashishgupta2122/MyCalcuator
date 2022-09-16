package com.ashish.mycalculator.temp;
import java.util.*;
public class JhosephusProblem {
    public static int Jhosephus(int n,int k)
    {
        if (n == 1)
        {
            return 0;
        }
        return (Jhosephus(n - 1,k) + k) % n;
    }
    public static void main(String[] args)
    {
        int n = 5;
        int k = 3;
        System.out.println(Jhosephus(n,k)+" ");
    }
}