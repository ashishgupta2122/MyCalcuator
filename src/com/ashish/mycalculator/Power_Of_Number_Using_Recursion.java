package com.ashish.mycalculator;
import java.util.*;
public class Power_Of_Number_Using_Recursion {
    public static int power(int a,int b)
    {
        if (b == 0)
        {
            return 1;
        }
        else
        {
            return a * power(a,b - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of a");
        int a = sc.nextInt();
        System.out.println("Enter The Number of b");
        int b= sc.nextInt();
        System.out.println(power(a,b));
    }
}
