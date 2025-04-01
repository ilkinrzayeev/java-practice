package az.edu.turing.module02.part01.lesson06;

abstract class Shape {
    abstract void draw();
}

class Circuit1 extends Shape {
    void draw() {
        System.out.println("Drawing Circuit");
    }
}

public class Circuit {
    public static void main(String[] args) {
        Shape shape = new Circuit1();
        shape.draw();
    }
}