package com.ashish.mycalculator;
import java.util.Scanner;
public class Trangular_Character_Pattern_Print {
    public static void main(String[] args)
    {
        int n = 5;
        int i = 1;
        while(i <= n)
        {
            int j = 1;
            char start = (char)('A' + n - i);
            while(j <= i)
            {
                System.out.print(start +" ");
                start++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
//Output
//E
//D E
//C D E
//B C D E
//A B C D E