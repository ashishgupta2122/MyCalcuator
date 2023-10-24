package oops1;

public class LearnConstructors {
    public static void main(String[] args) {
//        Complex num1 = new Complex(3,5);
        Complex num1 = new Complex(2);
        Complex num2 = new Complex(2,4);
        num1.print();
        num2.print();
    }
}
class Complex {
    int a,b;

    public  Complex(int real) {
        a = real;
        b = 12;
    }

    public Complex(int real,int imaginary) {
        a = real;
        b = imaginary;
    }

    void print() {
        System.out.println(a+" + "+b+"i");
    }
}
