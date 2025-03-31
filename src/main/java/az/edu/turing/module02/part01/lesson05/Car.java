package az.edu.turing.module02.part01.lesson05;

class Car1 {
    private String color;

    public Car1 (String color) {
        this.color = color;
    }

    public String toString() {
        return "color: " + color;
    }
}

class Mercedes extends Car1 {
    private String model;

    public Mercedes(String model, String color) {
        super(color);
        this.model = model;
    }

    public String toString() {
        return "model: " + model + ", " + super.toString();
    }
}

public class Car {
    public static void main(String[] args) {
        Car1 car1 = new Mercedes("Mercedes C250", "black");
        System.out.println(car1);
    }
}

