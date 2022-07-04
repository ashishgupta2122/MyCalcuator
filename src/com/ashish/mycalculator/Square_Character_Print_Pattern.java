package com.ashish.mycalculator;
import java.util.Scanner;
public class Square_Character_Print_Pattern {
    public static void main(String[] args)
    {
        int n = 4;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                System.out.print((char) ('A' + i - 1));
            }
            System.out.println();
        }
    }
}
