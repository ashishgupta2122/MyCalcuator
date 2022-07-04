package com.ashish.mycalculator;
import java.util.Scanner;
public class Trangular_Number_Pattern_Print4 {
    public static void main(String[] args)
    {
        int n = 4;
        int number = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}
//Output
//   1
//  23
// 456
//78910