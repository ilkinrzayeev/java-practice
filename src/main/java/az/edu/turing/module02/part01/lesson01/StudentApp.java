package az.edu.turing.module02.part01.lesson01;

public class StudentApp {

    public static void main(String[] args) {
        Student student = new Student("Ilkin", 19);

        System.out.println(student.name);
        System.out.println(student.grade);
        System.out.println(student.age);
        System.out.println(student);
    }
}
