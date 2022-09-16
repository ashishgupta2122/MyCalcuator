package com.ashish.mycalculator;
import java.util.*;
public class Oops_Basic {
    public static void main(String[] args)
    {
        Person s1 = new Person();
        s1.name = "Ashish";
        s1.age = 18;

        //System.out.println(s1.name +" " + s1.age);
        //s1.eat();
        //s1.walk();

        //s1.walk(2);

        //Developer d1 = new Developer("Ashish",18);
        //d1.eat();

        EncapsulationIntro s2 = new EncapsulationIntro();
       // s2.doWork();

    }
}
class Developer extends Person
{
    public Developer(String name,int age)
    {
        super(name,age);
    }
}
class Person
{
    String name;
    int age;

    //Constructor
    public Person()
    {
        System.out.println("Creating a Objects");
    }

    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    void eat()
    {
        System.out.println(name + " is eating");
    }
    void walk()
    {
        System.out.println(name + " is walking");
    }
    void walk(int steps)
    {
        System.out.println(name + " walked "+steps);
    }
    void dowork()
    {
        System.out.println("Person is Working");
    }
}