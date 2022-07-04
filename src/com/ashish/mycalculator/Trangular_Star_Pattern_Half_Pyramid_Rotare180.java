package com.ashish.mycalculator;
import java.util.Scanner;
public class Trangular_Star_Pattern_Half_Pyramid_Rotare180 {
    public static void main(String[] args)
    {
        int n = 5;
        for(int i = 1; i <= n; i++)
        {
            //2nd Loop Space Print Karane Ke Liye
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");;
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//output
//    *
//   **
//  ***
// ****
//*****