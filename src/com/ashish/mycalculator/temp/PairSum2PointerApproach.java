package com.ashish.mycalculator.temp;
import java.util.*;
public class PairSum2PointerApproach {
    public static boolean Sum(ArrayList<Integer> list, int target){
        //2 Pointer Approach
        int lp = 0;
        int rp = list.size()-1;

        while (lp != rp){
            if (list.get(lp) + list.get(rp) == target){
                return true;
            }
            if (list.get(lp) + list.get(rp) < target){
                lp++;
            }else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println("The Pair Sum of "+Sum(list,target));
    }
}
