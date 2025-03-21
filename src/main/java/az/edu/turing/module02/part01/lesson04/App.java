package az.edu.turing.module02.part01.lesson04;

class Disk {
    private double radius = 1.5;

    public Disk(double r) {
        radius = r;
    }

    public double getDiameter() {
        return radius * 2;
    }
}

public class App {
    public static void main(String[] args) {
        Disk disk = new Disk(5.0);
        System.out.println(disk.getDiameter());
    }
}

