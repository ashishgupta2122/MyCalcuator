package com.ashish.mycalculator.temp;
import java.util.*;
public class ReplaceSpaces {
    public static void main(String[] args) {
        String str = "My name is Ashish   ";
        str = str.trim();

        str = str.replaceAll("\\s", "@40");

        // Display the result
        System.out.println(str);
    }
}
