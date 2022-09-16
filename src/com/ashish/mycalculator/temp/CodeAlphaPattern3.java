package com.ashish.mycalculator.temp;
import java.util.*;
public class CodeAlphaPattern3 {
    public static void main(String[] args)
    {
        int n = 5;
        int alphabet = 65;
        for (int i = 0; i <= n; i++)
        {
            //1st Step;
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j)+" ");
            }
            System.out.println();
        }
        //2nd Part
        for (int i = n - 1; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j)+" ");
            }
            System.out.println();
        }
    }
}
