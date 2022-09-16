package com.ashish.mycalculator.temp;
import java.util.*;
public class TranglePattern1 {
    public static void main(String[] args)
    {
        int m = 5;
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}