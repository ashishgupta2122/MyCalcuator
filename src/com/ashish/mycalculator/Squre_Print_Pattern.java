package com.ashish.mycalculator;
import java.util.Scanner;
public class Squre_Print_Pattern {
    public static void main(String[] args){
        int m = 5;
        int n = 5;

        //1st Row Print Karne Ke Liye
        for(int i = 1; i <= m; i++)
        {
            //2nd Step Col Print Karne Ke Liye
            for(int j = 1; j <= n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
//Output
//*****
//*****
//*****
//*****
//****