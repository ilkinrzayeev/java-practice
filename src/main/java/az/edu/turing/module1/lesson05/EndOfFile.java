package az.edu.turing.module1.lesson05;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long sum = 0;
        while (scan.hasNextInt()) {
            sum += scan.nextInt();
        }

        System.out.println(sum);
    }
}
