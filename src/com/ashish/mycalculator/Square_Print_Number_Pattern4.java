package com.ashish.mycalculator;
import java.util.Scanner;
public class Square_Print_Number_Pattern4 {
    public static void main(String[] args)
    {
        int n = 5;
        int number = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
//Output
//1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25
