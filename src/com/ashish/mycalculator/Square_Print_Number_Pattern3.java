package com.ashish.mycalculator;
import java.util.Scanner;
public class Square_Print_Number_Pattern3 {
    public static void main(String[] args)
    {
        int n = 4;
        for(int i = 1; i <= n; i++)
        {
            for(int j = n; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//Output
//4321
//4321
//4321
//4321