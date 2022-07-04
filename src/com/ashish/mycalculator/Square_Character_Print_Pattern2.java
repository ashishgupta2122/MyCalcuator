package com.ashish.mycalculator;
import java.util.Scanner;
public class Square_Character_Print_Pattern2 {
    public static void main(String[] args)
    {
        int n = 5;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }
    }

}
