package com.ashish.mycalculator;
import java.util.Scanner;
public class Recursion_Sub {
    public static int sub(int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        return n = sub(n - 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int ans = sub(n);
        System.out.println("The Sub of Number "+ans);
    }
}
