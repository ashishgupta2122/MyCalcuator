package com.ashish.mycalculator;
import java.util.*;
public class Opps_Q1 {
    public static void main(String[] args)
    {
        Area s1 = new Area();
        s1.length = 2;
        s1.breath = 3;
        s1.height = 4;

        int area = s1.length * s1.breath * s1.height;
        System.out.println(area);
    }
}
class Area
{
    int length;
    int breath;
    int height;
}