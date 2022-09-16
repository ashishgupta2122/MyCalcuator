package com.ashish.mycalculator;
import java.util.*;
public class Method_Overloading {
    static int maxof(int a,int b)
    {
        if (a > b)
        {
            return a;
        } else {
            return b;
        }
    }
    //Overloading Concept
    static float maxof(float a,float b)
    {
        if (a > b)
        {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        int firstNumber = 26;
        int secondNumber = 34;
        int ans = maxof(firstNumber,secondNumber);
        System.out.println(ans);

        float First = 21;
        float Second = 22;
        float ans1 = maxof(First,Second);
        System.out.println(ans1);

    }
}
