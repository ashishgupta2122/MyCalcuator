package com.ashish.mycalculator;
import java.util.*;
public class HashsetBasic {
    public static void main(String[] args)
    {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(12);
        s1.add(12);
        s1.add(13);
        s1.add(14);
        s1.add(15);
        s1.add(16);
        s1.add(17);
        System.out.println(s1+" ");
        if (s1.contains(14))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
        System.out.println(s1.remove(17));
    }
}
