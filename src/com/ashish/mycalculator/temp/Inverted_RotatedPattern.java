package com.ashish.mycalculator.temp;
import java.util.*;
public class Inverted_RotatedPattern {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;

        for (int i = 1; i <= n; i++){
            //space ke liye
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            //Now Start print karne ke liye
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
