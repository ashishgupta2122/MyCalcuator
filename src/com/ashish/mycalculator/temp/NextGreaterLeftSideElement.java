package com.ashish.mycalculator.temp;
import java.util.*;
public class NextGreaterLeftSideElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGratest[] = new int[arr.length];

        for (int i = 0; i < arr.length-1; i++) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGratest[i] = -1;
            } else {
                nextGratest[i] =  arr[i];
            }

            s.push(i);
        }

        for (int i = 0; i < nextGratest.length; i++) {
            System.out.print(nextGratest[i]+" ");
        }
        System.out.println();
    }
}
