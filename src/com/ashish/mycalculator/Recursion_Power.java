package com.ashish.mycalculator;
import java.util.Scanner;
public class Recursion_Power {
    public static int power(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        return 2 * power(n - 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int ans = power(n);
        System.out.println("The Square of Number "+ans);
    }
}
