package com.ashish.mycalculator;
import java.util.Scanner;
public class Recursion_Count {
    public static int cout(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        int ans = cout(n/10);
        return ans+1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        System.out.println(cout(n));
    }
}