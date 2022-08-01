package com.ashish.mycalculator;
import java.util.Scanner;
public class Butterfly_Pattern_Print {
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Part
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
