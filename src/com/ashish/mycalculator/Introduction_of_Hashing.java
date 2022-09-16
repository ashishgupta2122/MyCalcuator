package com.ashish.mycalculator;
import java.util.*;
public class Introduction_of_Hashing {
    public static void main(String[] args)
    {
        HashSet<Integer> s = new HashSet<>();
        s.add(12);
        s.add(13);
        s.add(14);
        s.add(15);
        s.add(16);
        System.out.println(s);
        if (s.contains(12))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }
        s.remove(12);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
    }
}
