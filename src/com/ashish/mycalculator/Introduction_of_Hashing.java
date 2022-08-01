package com.ashish.mycalculator;
import java.util.*;
public class Introduction_of_Hashing {
    public static void main(String[] args)
    {
        HashSet<Integer> sc = new HashSet<>();
        sc.add(10);
        sc.add(20);
        sc.add(45);
        System.out.print(sc);
        if (sc.contains(10))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }
        sc.remove(10);
        System.out.println(sc.isEmpty());
        System.out.println(sc.size());
        sc.clear();
    }
}
