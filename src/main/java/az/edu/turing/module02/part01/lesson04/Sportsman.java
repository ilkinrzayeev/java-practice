package az.edu.turing.module02.part01.lesson04;

class Person {
    public void eat() {
        System.out.println("Eating junk food");
    }

    public void eat(String food) {
        System.out.println("Eating " + food);
    }
}

class BasketballPlayer extends Person {
    @Override
    public void eat() {
        System.out.println("Eating healthy food");
    }
}

public class Sportsman {

    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
        p.eat("salad");

        BasketballPlayer s = new BasketballPlayer();
        s.eat();
    }
}

