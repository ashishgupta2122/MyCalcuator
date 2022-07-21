package com.ashish.mycalculator;
import java.util.Scanner;
public class Count_Zero_Solution_Recursion {
    public static int cout_Zero(int a)
    {
        if (a < 10)
        {
            if (a == 0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if(a % 10 == 0)
        {
            return cout_Zero(a/10)+1;
        }
        else
        {
            return cout_Zero(a/10);
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int a = sc.nextInt();
        int ans = cout_Zero(a);
        System.out.println(ans+" ");
    }
}
