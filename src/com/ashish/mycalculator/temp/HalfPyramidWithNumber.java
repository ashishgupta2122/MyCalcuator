package com.ashish.mycalculator.temp;
import java.util.*;
public class HalfPyramidWithNumber {
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
