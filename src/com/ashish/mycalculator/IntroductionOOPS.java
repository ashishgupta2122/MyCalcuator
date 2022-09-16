package com.ashish.mycalculator;
import java.util.*;
public class IntroductionOOPS {
    static class  Student
    {
        int roll_no;
        String name;
        float marks = 92.3f;

        Student()
        {
            this.roll_no = 21;
            this.name = "Ashish Gupta";
            this.marks = 98.5f;
        }
        Student(int roll,String name, float marks)
        {
            this.roll_no = roll;
            this.name = name;
            this.marks = marks;
        }
        //void greeting()
        //{
          //  System.out.println("Hello My Name is "+this.name);
        //}


    }
    public static void main(String[] args)
    {
        Student Ashish = new Student();
       // Ashish.roll_no = 28;
        //Ashish.name = "Ashish Gupta";
        //Ashish.marks = 90.7f;

        //System.out.println(Ashish.roll_no);
        //System.out.println(Ashish.name);
        //System.out.println(Ashish.marks);

        //Ashish.greeting();
        Student Ashish1 = new Student(21,"Ashish Kiya",98.54f);
    }
}
