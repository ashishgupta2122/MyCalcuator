package com.ashish.mycalculator;
import java.util.Scanner;
public class Q1 {
    public static int add(int a,int b)
    {
        return a + b;
    }
    public static int sub(int a,int b)
    {
        return a - b;
    }
    public static int product(int a,int b)
    {
        return a * b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a,b);
        System.out.println(sum);

        int sub = sub(a,b);
        System.out.println(sub);
    }
}
