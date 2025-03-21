package az.edu.turing.module02.part01.lesson04;

class Animal2 {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal2 {
    public void makeSound() {
        System.out.println("Dog barks");
    }
    public void fetch() {
        System.out.println("Dog is fetching");
    }
}

public class Animal {

    public static void main(String[] args) {
        Animal2 animal = new Animal2();
        animal.makeSound();
    }
}
