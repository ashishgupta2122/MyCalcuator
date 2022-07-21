package com.ashish.mycalculator;
import java.util.Scanner;
public class Multiplication_Recursion {
    public static int multiplication(int a,int b)
    {
        if(a == 0 || b == 0)
        {
            return 0;
        }
        return a +multiplication(a,b - 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number");
        int b = sc.nextInt();
        int ans = multiplication(a,b);
        System.out.println("The Multiplication of Two Number "+ans);
    }
}
