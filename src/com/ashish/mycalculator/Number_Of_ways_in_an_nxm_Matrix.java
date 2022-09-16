package com.ashish.mycalculator;
import java.util.*;
public class Number_Of_ways_in_an_nxm_Matrix {
    public static int count(int m,int n)
    {
        if (m == 1 || n == 1)
        {
            return 1;
        }
        else
        {
           return count(m - 1,n) + count(m,n - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(count(m,n));
    }
}
