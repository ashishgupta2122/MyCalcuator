package com.ashish.mycalculator;
import java.util.Scanner;
public class Sum_of_Digit_Recursive {
    public static int sum(int a)
    {
        int sum = 0;
        if (a < 10)
        {
            return a;
        }
        sum = (a % 10) + sum(a / 10);
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int a = sc.nextInt();
        int ans = sum(a);
        System.out.println("The Sum of Number "+ans);
    }
}
