package com.ashish.mycalculator;

import java.util.Scanner;

public class Recursion_Josephus_Problem {
    public static int Recursion(int n,int k)
    {
        if (n == 1)
        {
            return 0;
        }
        else
        {
            return (Recursion(n - 1,k)+k)%n;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(Recursion(n,k));
    }
}
