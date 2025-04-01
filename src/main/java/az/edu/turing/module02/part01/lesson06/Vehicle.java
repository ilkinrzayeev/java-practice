package az.edu.turing.module02.part01.lesson06;

abstract class Vehicle1 {
    public void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle1 {
    public void start() {
        System.out.println("Wroom!!!");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
