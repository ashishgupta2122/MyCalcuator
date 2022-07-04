package com.ashish.mycalculator;
import java.util.Scanner;
public class Square_Print_Number_Pattern2 {
    public static void main(String[] args)
    {
        int n = 4;
        //1st Step Row Ke Liye
        for(int i = 1; i <= n; i++)
        {
            //2nd Step Col Ke Liye
            for(int j = 1; j <= n; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
