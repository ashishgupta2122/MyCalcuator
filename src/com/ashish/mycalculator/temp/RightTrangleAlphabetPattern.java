package com.ashish.mycalculator.temp;
import java.util.*;
public class RightTrangleAlphabetPattern {
    public static void main(String[] args)
    {
        int n = 5;
        int alphabet = 65;

        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < n - 1; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (alphabet+k));
            }
            System.out.println();
        }
    }
}
