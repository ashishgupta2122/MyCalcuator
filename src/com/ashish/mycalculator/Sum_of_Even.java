package com.ashish.mycalculator;
import java.util.Scanner;
public class Sum_of_Even {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evensum = 0, oddsum = 0;
        while(num > 0)
        {
            int lastnum = (num % 10);
            if(lastnum % 2 == 0)
            {
                evensum += lastnum;
            }
            else{
                oddsum += lastnum;
            }
            num = num / 10;
        }
        System.out.println(evensum +" " + oddsum);

    }
}
