package com.ashish.mycalculator;
import java.util.*;
public class Introduction_Of_Collectionframework {
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        //Here list.add or list.last or same
        list.add(12);
        list.add(23);
        list.add(21);
        list.add(43);
        list.add(11);

        System.out.println(list.size());
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

    }
}
