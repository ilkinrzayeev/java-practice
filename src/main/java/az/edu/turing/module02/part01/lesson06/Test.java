package az.edu.turing.module02.part01.lesson06;

interface C {
    void show();
}

interface D {
    void display();
}

class MyClassroom implements C, D {
    public void show() {
        System.out.println("Show X");
    }

    public void display() {
        show();
        System.out.println("Show Y");
    }
}

public class Test {
    public static void main(String[] args) {
        MyClassroom obj = new MyClassroom();
        obj.show();
        obj.display();
    }
}

