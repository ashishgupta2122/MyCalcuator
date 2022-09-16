package com.ashish.mycalculator;
import java.util.*;
public class Abstraction {
    public static void main(String[] args) {
        //Abstract mein ham object nahi banate hai
        BMW s1 = new BMW();
        s1.start();
    }
}
class BMW extends car
{
  void start()
  {
      System.out.println("BMW is Starting");
  }
}
class Audi extends car
{
    void start()
    {
        System.out.println("Audi is Starting");
    }
}
abstract class car
{
    int price;

   abstract void start();
}