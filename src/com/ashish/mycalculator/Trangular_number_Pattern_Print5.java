package com.ashish.mycalculator;
import java.util.Scanner;
public class Trangular_number_Pattern_Print5 {
    public static void main(String[] args)
    {
        int n = 8;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
            {
                if(j >= i)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//Output
//1111111
// 22222
//  333
//   4