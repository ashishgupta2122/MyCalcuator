package com.ashish.mycalculator;
import java.util.*;
//Print the  sum,  difference  and   product of   two  complex numbers by  creating a   classnamed 'Complex' with separate methods for each operation whose real and imaginaryparts are entered by use
public class OOPS_Question3 {
    public static void main(String[] args)
    {
        Complex s3 = new Complex();
        s3.a = 12;
        s3.b = 24;
        float sum = (s3.a + s3.b);
        float divide = (s3.b/s3.a);

        System.out.println("The Sum of Two Number "+sum);
        System.out.println("The Divide of Two Number "+divide);


    }
}
class Complex
{
    float a;
    float b;
}
