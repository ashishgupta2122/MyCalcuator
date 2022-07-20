package com.ashish.mycalculator;
import java.util.Scanner;
public class Array_Sqrt {
    public static long sqrt(int n)
    {
        long start = 0;
        long end = n - 1;
        long ans = -1;
        while (start <= end)
        {
            long mid = start + (end - start)/2;
            long square = mid * mid;
            if (square == n)
            {
                return mid;
            }
            else if(square < n)
            {
                ans = mid;
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    }
    public static double morePrecision(int n,int precision,double tempsol)
    {
        double factor = 1;
        double ans = tempsol;
        for (int i = 0; i < precision; i++)
        {
            factor = factor/10;
            for (double j = ans; j*j < n; j = j+factor)
            {
                ans = j;
            }
        }
        return ans;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        double tempsol = sqrt(n);
        System.out.println("The Squre Root of Number "+morePrecision(n,3,tempsol));

    }
}
