package oops3.learnEncapsulation;

import oops3.learnPackage.Person;

public class MainEncapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(12);

        System.out.println(p1.getAge());

    }
}
