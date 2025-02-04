package az.edu.turing.module01.lesson03;

import java.util.Scanner;

public class StringLengthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.length() * 2);
    }
}
