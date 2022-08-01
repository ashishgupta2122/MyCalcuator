package com.ashish.mycalculator;
import java.util.Scanner;
public class Swap_two_Number {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 7;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Swapping a two Number a = "+a +"b = "+b);

    }
}
