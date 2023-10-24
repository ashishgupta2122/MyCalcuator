package oops4;

public class LearnAbstract {
    public static void main(String[] args) {
        Car s1 = new Car();
        s1.accelerate();
        s1.brakes(4);
    }
}

abstract class Vehicle {
    abstract void accelerate();
    abstract int brakes(int wheels);
}
class Car extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Car is Accelerate");
    }

    @Override
    int brakes(int wheels) {
        System.out.println("Car brakes are pushed");
        return wheels;
    }
}
