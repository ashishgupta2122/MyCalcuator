package com.ashish.mycalculator.temp;
import java.util.*;
public class PostfixExperation {
    public static int Experation(String exp)
    {
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < exp.length(); i++)
        {
            char c = exp.charAt(i);
            if(Character.isDigit(c))
            {
                s1.push(c - '0');
            }
            else
            {
                int val1 = s1.pop();
                int val2 = s1.pop();

                switch (c)
                {
                    case'+':
                        s1.push(val2 + val1);
                        break;

                    case'-':
                        s1.push(val2 - val1);
                        break;

                    case'*':
                        s1.push(val2 * val1);
                        break;

                    case'/':
                        s1.push(val2 / val1);
                        break;
                }
            }
        }
        return s1.pop();
    }
    public static void main(String[] args)
    {
        String exp = "231*+9-";
        System.out.println("Postfix Evaluate "+Experation(exp));
    }
}