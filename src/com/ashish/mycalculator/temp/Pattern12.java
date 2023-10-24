package com.ashish.mycalculator.temp;
import java.util.*;
public class Pattern12 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //2nd part
        for (int i = n-1; i >= 1; i--) {
            for (int j = i+1; j < n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
