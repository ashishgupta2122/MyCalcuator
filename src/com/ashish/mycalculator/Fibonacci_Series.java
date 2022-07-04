package com.ashish.mycalculator;
import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a+" ");
        System.out.println(b+" ");
        for(int i = 0; i <= n; i++)
        {
            int nextnumber = a + b;
            System.out.println(nextnumber);
            a = b;
            b = nextnumber;
        }
    }
}
