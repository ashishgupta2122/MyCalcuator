package com.ashish.mycalculator;
import java.util.Scanner;
public class Recursion_Reach_Home {
    public static void Reach_Home(int src,int dest)
    {
        System.out.println("Source " +src);
        System.out.println("Destination "+ dest);
        if (src == dest)
        {
            System.out.println("Pahuch Gaya");
            return ;
        }
        src++;
        Reach_Home(src,dest);
    }
    public static void main(String[] args)
    {
        int dest = 10;
        int src = 1;
        Reach_Home(src,dest);
    }
}
