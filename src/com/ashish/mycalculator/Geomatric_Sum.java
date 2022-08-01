package com.ashish.mycalculator;
import java.util.Scanner;
import java.math.MathContext;
public class Geomatric_Sum {
    public static double sum(int a)
    {
        if (a == 0)
        {
            return 1;
        }
        return sum(a - 1) + 1 / Math.pow(2,a);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The nth Number");
        int a = sc.nextInt();
        System.out.println(sum(a));

    }
}
