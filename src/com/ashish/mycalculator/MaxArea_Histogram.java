package com.ashish.mycalculator;
import java.util.Stack;
public class MaxArea_Histogram {
    public static int maxArea(int a[])
    {
        int maxAns = 0;
        int ps[] = prevsmaller(a);
        int ns[] = nextsmaller(a);

        for (int i = 0; i < a.length; i++)
        {
            int curr = (ns[i] - ps[i] - 1) * a[i];
            int maxArea;
            maxAns = Math.max(maxAns,curr);
        }
        return maxAns;
    }
    public static int[] prevsmaller(int a[])
    {
        int ps[] = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++)
        {
            while (!s.isEmpty() && a[s.peek()] >= a[i])
            {
                s.pop();
            }
            if (s.isEmpty())
            {
                ps[i] = -1;
            }
            else
            {
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    public static int[] nextsmaller(int a[])
    {
        int ns[] = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++)
        {
            while (!s.isEmpty() && a[s.peek()] <= a[i])
            {
                s.pop();
            }
            if (s.isEmpty())
            {
                ns[i] = -1;
            }
            else
            {
                ns[i] = s.peek();
            }
            s.push(i);
        }
        return ns;
    }
    public static void main(String[] args)
    {
        int a[] = {7, 3, 6, 5, 6, 2, 7};
        int n = 7;
        System.out.println(maxArea(a));
    }
}
