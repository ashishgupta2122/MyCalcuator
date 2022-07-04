package com.ashish.mycalculator;
import java.util.Scanner;
public class Squqre_Character_Print_Pattern5 {
    public static void main(String[] args)
    {
        int n = 5;
        int i = 1;
        while(i <= n)
        {
            int j = 1;
            while (j <= i)
            {
                System.out.print((char) ('A' + i - 1));
                j++;
            }
            System.out.println();
            i++;

        }
    }
}
//Output
//A
//BB
//CCC
//DDDD
//EEEEE