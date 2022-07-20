package com.ashish.mycalculator;
import java.util.Scanner;
public class Recursion_Sum {
    public static int sum(int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        return n + sum(n - 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println("The Sum of Number "+ans);
    }
}
