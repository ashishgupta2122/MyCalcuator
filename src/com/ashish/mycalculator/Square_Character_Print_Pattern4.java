package com.ashish.mycalculator;
import java.util.Scanner;
public class Square_Character_Print_Pattern4 {
    public static void main(String[] args)
    {
        int n = 5;
        char ch = 'A';
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
//OutPut- A B c D E
//        F G H I J
//        K L M N O
//        P Q R S T
//        U V W X Y
//
//
//