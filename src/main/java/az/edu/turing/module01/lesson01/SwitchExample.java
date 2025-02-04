package az.edu.turing.module01.lesson01;

public class SwitchExample {
    public static void main(String[] args) {
        int a = 109;
        switch (a) {
            case 1 -> System.out.println("equals to 1");
            case 50 -> System.out.println("equals to 50");
            case 109 -> System.out.println("equals to 109");
            case 200 -> System.out.println("equals to 200");
            default -> System.out.println("Not found");
        }

    }
}

