package com.ashish.mycalculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class LearnCollection_Class {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(35);
        list.add(21);
        list.add(45);
        list.add(50);
        //System.out.println(Collections.max(list));
        //System.out.println(Collections.min(list));

        //Ab Ham Array ko Kaise Sort Kare Collection ke help se
        //Collections.sort(list);
        //Ab Kaise Descending Order mein print kare
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
