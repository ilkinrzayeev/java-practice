package az.edu.turing.module02.part01.lesson02;

public class StudentApp1 {

    public static void main(String[] args) {
        Student Ilkin = new Student("Ilkin", 19);
        System.out.println(Ilkin.name);
        System.out.println(Ilkin.age);
        System.out.println(Ilkin.grade);

        Ilkin.grade = 100;
        System.out.println(Ilkin.grade);
    }
}
