package com.ashish.mycalculator;
import java.util.Scanner;
public class Trangular_Number_Pattern_Half_Pyramid_Rotate4 {
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - 1; j++)
            {
                if ( j >= i)
                {
                    System.out.print(j);
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
//1234
// 234
//  34
//   4
//
//
//