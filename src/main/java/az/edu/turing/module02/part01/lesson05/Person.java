package az.edu.turing.module02.part01.lesson05;

class Person1 {
    private String name = "Ilkin";

    public void introduce() {
        System.out.println("Hello, my name is " + name);
    }
}

class Student extends Person1 {
    private String university = "ASOIU";

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I study at " + university);
    }
}

public class Person {
    public static void main(String[] args) {
        Person1 person1 = new Student();
        person1.introduce();
    }
}

