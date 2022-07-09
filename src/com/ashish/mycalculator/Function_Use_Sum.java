package com.ashish.mycalculator;
import java.util.Scanner;
public class Function_Use_Sum {
    public static int math(int a,int b)
    {
        return a + b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number");
        int b = sc.nextInt();
        System.out.println(math(a,b));
    }
}
