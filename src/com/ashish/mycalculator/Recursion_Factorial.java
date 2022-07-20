package com.ashish.mycalculator;
import java.util.Scanner;
public class Recursion_Factorial {
    public static int fact(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println("The Factorial Number of "+ans);
    }
}
