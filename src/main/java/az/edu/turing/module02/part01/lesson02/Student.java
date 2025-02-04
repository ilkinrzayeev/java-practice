package az.edu.turing.module02.part01.lesson02;

public class Student {

    public static int studentCount = 0;
    public static String globalString;


    public String name;
    public double grade;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }
}
