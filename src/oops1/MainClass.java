package oops1;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
//        d1.name = "Tommy";
//        d1.walking();
//
//        Dog d2 = new Dog();
//        d2.name = "Leo";
//        d2.barking();

        Complex num1 = new Complex(3,5);
        num1.print();
    }
}

class Dog {
    String name;
    int age;
    String color;

    void walking() {
        System.out.println(name+" is Walking");
    }

    void barking() {
        System.out.println(name+" is Barking");
    }
}

//class Complex {
//    int a = 3;
//    int b = 5;
//
//    void print() {
//        System.out.println(a+" + "+b+"i");
//    }
//}
