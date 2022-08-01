package com.ashish.mycalculator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add.list
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(6);
        list.add(5);
        System.out.println(list);

        //get.list
        int element = list.get(4);
        System.out.println(element);

        //add element in between
        list.add(0,0);
        System.out.println(list);

        //set element
        list.set(2,9);
        System.out.println(list);

        //delete element
        list.remove(2);
        System.out.println(list);

        //size element
        int size = list.size();
        System.out.println(size);

        //loops
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
