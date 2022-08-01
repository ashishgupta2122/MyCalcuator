package com.ashish.mycalculator;

import java.util.Scanner;

public class Recursion_Problem_NumberofWays_in_an_nxm_Matrix {
    public static int  Recursion(int n,int m)
    {
        if (n == 1 || m == 1)
        {
            return 1;
        }
        else
        {
            return Recursion(n - 1,m) + Recursion(n,m - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Recursion(n,m));
    }
}
