package com.ashish.mycalculator;
import java.util.*;
public class Insert_ElementArray {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(5);

        l1.add(3,4);
        System.out.print(l1);
    }
}
