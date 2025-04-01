package az.edu.turing.module02.part01.lesson05;

class Human1 {
    private String name;

    public Human1 (String name) {
        this.name = name;
    }

    public boolean equals(Object object) {
        if (object instanceof Human1) {
            Human1 human1 = (Human1) object;
            return this.name.equals(human1.name);
        }
        return false;
    }
}

public class Human {
    public static void main(String[] args) {
        Human1 human1 = new Human1("Ilkin");
        Human1 human3 = new Human1("Ilkin");
        Human1 human4 = human1;

        System.out.println(human1.equals(human3));
        System.out.println(human1.equals(human4));
        System.out.println(human1 == human3);
        System.out.println(human1 == human4);
    }
}

