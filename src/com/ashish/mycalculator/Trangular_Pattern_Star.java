package com.ashish.mycalculator;
import java.util.Scanner;
public class Trangular_Pattern_Star {
    public static void main(String [] args)
    {
        int n = 4;
        //1st step Row ke Liye
        for(int i = 1; i <= n; i++)
        {
            //2nd step Col ke liye
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Output
//*
//**
//***
//****