package az.edu.turing.module02.part01.lesson04;

class Vehicle2 {
    public String drive() {
        return "Vehicle is driving";
    }

    public void useHorn() {
        System.out.println("Beep!!!");
    }
}

class Car extends Vehicle2 {
    public String drive() {
        return "Car is driving";
    }
}

public class Vehicle {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.drive());
        car.useHorn();
    }
}

