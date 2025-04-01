package az.edu.turing.module02.part01.lesson06;

interface Flier1 {
    static void takeOff() {
        System.out.println("Takes off...");
    }
}

abstract class Bird implements Flier1 {
    public static void fly() {
        System.out.println("Bird is flying");
    }
}

public class Flier {
    public static void main(String[] args) {
        Flier1.takeOff();
        Bird.fly();
    }
}

