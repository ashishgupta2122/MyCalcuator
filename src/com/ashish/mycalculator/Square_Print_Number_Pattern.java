package com.ashish.mycalculator;
import java.util.Scanner;
public class Square_Print_Number_Pattern {
    public static void main(String[] args)
    {
        int n = 4;
        //1st step Row ke Liye
        for(int i = 1; i <= n; i++)
        {
            //2nd Step Col ke Liye
            for(int j = 1; j <= n; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
//Output
//1111
//2222
//3333
//4444