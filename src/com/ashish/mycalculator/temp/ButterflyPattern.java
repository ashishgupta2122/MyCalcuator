package com.ashish.mycalculator.temp;
import java.util.*;
public class ButterflyPattern {
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            //Star Print Karne ke Liye
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            //Space Print Karne Ke Liye
            int space =  2 * (n - i);
            for (int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            //2nd Part
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower ke liye
        for (int i = n; i >= 1; i--)
        {
            //Star Print Karne ke Liye
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            //Space Print Karne Ke Liye
            int space =  2 * (n - i);
            for (int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            //2nd Part
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
