package az.edu.turing.module01.lesson04;

import java.util.Scanner;

public class DivisionOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Divisors of" + ": " + number);
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

    }
}
