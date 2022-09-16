package com.ashish.mycalculator;
import java.util.*;
//Print the average of three numbers entered by user by creating a class named 'Average'having a method to calculate and print the average
public class OOPs_Question2 {
    public static void main(String[] args)
    {
        Average s2 = new Average();
        s2.a = 2;
        s2.b = 3;
        s2.c = 4;

        float average = (s2.a * s2.b * s2.c)/3;
        System.out.println("The Average Number of "+average);
    }
}
class Average
{
    float a;
    float b;
    float c;
}