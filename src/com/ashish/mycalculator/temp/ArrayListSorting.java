package com.ashish.mycalculator.temp;
import java.util.*;
public class ArrayListSorting {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        Collections.sort(list);
        System.out.print(list);
    }
}
