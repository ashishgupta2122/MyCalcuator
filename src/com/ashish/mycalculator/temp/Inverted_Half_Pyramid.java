package com.ashish.mycalculator.temp;
import java.util.*;
public class Inverted_Half_Pyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i+1; j+=1){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
