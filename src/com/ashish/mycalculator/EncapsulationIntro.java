package com.ashish.mycalculator;
import java.util.*;
public class EncapsulationIntro {
    public static void main(String[] args)
    {
        Laptop s3 = new Laptop();
        s3.setPrice(23);

        System.out.println(s3.getPrice());
    }
   // public void doWork()
    //{
      //  System.out.println("Working Working");
   // }
    static class Laptop
   {
       int ram;
       //Ham Chate hai Ki Hamare Price ko koi change na kr sake to uske liye
       //ham price ko Private Kar Dete hai,Aur ham isme jise admin banayenge o sirf acces kar sakta hai price ko
       private int price;

       public void setPrice(int price)
       {
           boolean isAdmin = true;
           if (!isAdmin)
           {
               System.out.println("You Can not set the Price");
           }
           else
           {
               this.price = price;
           }
       }
       public int getRam()
       {
           return ram;
       }
       public void setRam(int ram)
       {
           this.ram = ram;
       }
       public int getPrice()
       {
           return price;
       }
   }
}