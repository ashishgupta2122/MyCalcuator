package com.ashish.mycalculator;
import java.util.ArrayList;
public class Array_List_Demo {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(3,50);
        //arr.set(0,10);
        System.out.println(arr.size());
        System.out.println(arr.get(3));

        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
        //Enhanced for loop - for each loop
        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}
