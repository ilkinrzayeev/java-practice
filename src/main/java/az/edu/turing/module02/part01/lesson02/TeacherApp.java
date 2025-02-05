package az.edu.turing.module02.part01.lesson02;

public class TeacherApp {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ilkin", 10_000, 10 );
        System.out.println(teacher.getName());
        System.out.println(teacher.getSalary());
        System.out.println(teacher.getExperience());
        teacher.setGender(true );
        System.out.println(teacher.getGender());
    }
}
