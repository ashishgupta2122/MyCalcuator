package com.ashish.mycalculator.temp;
import java.util.*;
public class HashingBasic {
    public static void main(String[] args)
    {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        if (s1.contains(40))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }
        s1.remove(10);
        System.out.println(s1.isEmpty());
        System.out.println(s1.size());
        s1.clear();
    }
}
