package com.ashish.mycalculator;
import java.util.Scanner;
public class Trangular_Print_Number_Pattern {
    public static void main(String[] args)
    {
        int n = 4;
        for (int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//Output
//1
//12
//123
//1234