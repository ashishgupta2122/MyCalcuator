package com.ashish.mycalculator;
import java.util.*;
public class ConvertArrays_To_ArraysList {
    public static void main(String[] args)
    {
        String arr[] = {"PYTHON","JAVA","PHP","PERL","C#","C++"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));

        System.out.println(list);

    }
}
