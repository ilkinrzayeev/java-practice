package az.edu.turing.module02.part01.lesson02;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println(Student.globalString);
        System.out.println(Student.studentCount);

        Student student = new Student("Ilkin", 19);
        System.out.println(student.name);
        System.out.println(student.grade);
        System.out.println(student.age);
        System.out.println(student);
        System.out.println(student.studentCount);

        student.studentCount = 17;

        Student student1 = new Student("Elvin", 15);
        System.out.println(student1.name);
        System.out.println(student1.grade);
        System.out.println(student1.age);
        System.out.println(student1);
        System.out.println(student1.studentCount);

        System.out.println(Student.studentCount);

        System.out.println(Math.random());

        Runtime.getRuntime().gc();
    }
}
