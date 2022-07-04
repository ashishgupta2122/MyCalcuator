package com.ashish.mycalculator;
import java.util.Scanner;
public class Trangular_Number_Pattern_Half_Pyramid_Rotate2 {
    public static void main(String[] args)
    {
        int n = 5;
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
//Output
//55555
// 4444
//  333
//   22
//    1