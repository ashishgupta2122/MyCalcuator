package com.ashish.mycalculator.temp;
import java.util.*;
public class MaximumAreaOfHistogram {
    public static void Maximum(int arr[]) {
        int maximum = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        //1st smallest number calculate right side
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            }else {
                nsr[i] = s.peek();
            }

            s.add(i);
        }
        //2nd nsl smallest number calculate
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currsum = height * width;
            maximum = Math.max(currsum, maximum);
        }
        System.out.println("Maximum Area of Histogrm "+maximum);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        Maximum(arr);
    }
}
