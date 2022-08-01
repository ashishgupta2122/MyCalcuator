package com.ashish.mycalculator;
import java.util.Scanner;
public class StudentUse {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s1);
        s1.name = "Ashish";
        //s1.rollNumber = 100;
        s1.setRollNumber(21);
        System.out.println(s1.name +" " + s1.getRollNumber());

        s2.name = "Sahil";
        //s2.rollNumber = 22;
        System.out.println(s1.name+" ");
        //System.out.println(s2.name +" " + s2.rollNumber);
    }
}
