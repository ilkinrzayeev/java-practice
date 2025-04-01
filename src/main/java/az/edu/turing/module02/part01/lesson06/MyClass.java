package az.edu.turing.module02.part01.lesson06;

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void display() {
        System.out.println("B");
    }
}

class MyClass1 implements A, B {
}

public class MyClass {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.display();
    }
}
