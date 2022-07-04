package com.ashish.mycalculator;
import java.util.Scanner;
public class Trangular_Print_Number_Pattern3 {
    public static void main(String[] args)
    {
        //Doubt
        int n = 5;
        int i = 1;
        while(i <= n)
        {
            int j = 1;
            while(j <= i)
            {
                System.out.print(i-j+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
//Output
//1
//21
//321
//4321
//54321