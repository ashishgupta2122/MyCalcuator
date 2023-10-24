package com.ashish.mycalculator.temp;
import java.util.*;
public class Print {
    public static void swap(int index1,int index2) {
        int temp = index1;
        index1 = index2;
        index2 = temp;
    }
    public static void solve(String str,List<String> ans, int index) {
        //base case
        if (index >= str.length()) {
            ans.add(str);
            return;
        }

        for (int i = index; i < str.length(); i++) {
            swap(index,i);
            solve(str,ans,index);
            swap(index,i);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        solve(str, Collections.singletonList(""),0);

    }
}