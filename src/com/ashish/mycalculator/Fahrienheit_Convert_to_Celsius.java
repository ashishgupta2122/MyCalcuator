package com.ashish.mycalculator;
import java.util.Scanner;
public class Fahrienheit_Convert_to_Celsius {
    public static void main(String[] args)
    {
        float celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Fahrienheit");
        int f = sc.nextInt();
        celsius = (5*f-160)/9;
        System.out.println(celsius);
    }
}
