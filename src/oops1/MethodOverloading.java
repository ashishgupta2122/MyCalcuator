package oops1;
import java.util.*;
public class MethodOverloading {
    public static void main(String[] args) {
        Greet s1 = new Greet();
        s1.Greetings();
        s1.Greetings("Anuj");
        s1.Greetings("Ashish",2);
    }
}

class Greet {
    void Greetings() {
        System.out.println("Hello, Good Morning");
    }

    void Greetings(String name) {
        System.out.println("Hello "+name+", Good Morning");
    }

    void Greetings(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello "+name+", Good Morning");
        }
    }
}
