package com.ashish.mycalculator;
import java.util.*;
public class Sum_Of_Natural_Number_using_Recursion {
    public static int sum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n + sum(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
